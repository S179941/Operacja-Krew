package operacjakrew;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class GamePanel extends JPanel {
    
    JPanel game = new JPanel()
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;
            g2d.drawImage(OperacjaKrew.gameStatus.droplet.get_Image(),OperacjaKrew.gameStatus.droplet.get_xPosition(),OperacjaKrew.gameStatus.droplet.get_yPosition(),null);
            g2d.drawImage(Images.get_doctor(),OperacjaKrew.gameStatus.get_doctor_x(),OperacjaKrew.gameStatus.get_doctor_y(), null);
	}
    };
    
    JPanel menu = new JPanel();
    
    JLabel levelNumber = new JLabel();
    
    JLabel levelImage = new JLabel();
    JLabel levelDescription = new JLabel();
    
    JLabel levelTargetTitle = new JLabel();
    JLabel levelTarget = new JLabel();
    JLabel levelGroupTitle = new JLabel();
    JLabel levelGroup = new JLabel();
    
    JLabel levelBagsText = new JLabel();
    JLabel levelBagsIco = new JLabel();
    JLabel levelBagFilling = new JLabel();
    
    JButton start = new JButton();
    JButton exit = new JButton();
    
    JButton test = new JButton("TEST");
    
    ActionListener repainter = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
           if(OperacjaKrew.gameStatus.isFinished())
           {
               OperacjaKrew.gameStatus.droplet.reset();
               game.repaint();
               OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "ENDING");
           }
           else
           {
               if(OperacjaKrew.gameStatus.isStarted())
               {
                   OperacjaKrew.gameStatus.droplet.move_down();
                   //check_collision();
                   game.repaint();
               }
               
               levelNumber.setText(new String().format("Poziom %d",OperacjaKrew.gameStatus.get_current_level()));
               levelImage.setIcon(new ImageIcon(Scenarios.get_picture(OperacjaKrew.gameStatus.get_current_level())));
               levelDescription.setText(Scenarios.get_description(OperacjaKrew.gameStatus.get_current_level()));
               levelTarget.setText(new String().format("%d jednostki",Scenarios.get_target(OperacjaKrew.gameStatus.get_current_level())));
               levelGroup.setText(OperacjaKrew.gameStatus.get_patient_bloodtype_String());
               levelBagFilling.setIcon(new ImageIcon(OperacjaKrew.gameStatus.get_bag_filling()));
               game.repaint();
           }
           grabFocus();
        }
    };
    
    javax.swing.Timer cycler = new javax.swing.Timer(5,repainter);
    
    GamePanel() {
        setLayout(null);
        setFocusable(true);
        game.setBounds(5,5,750,720);
        game.setLayout(null);
        game.setBorder(BorderFactory.createLineBorder(Color.black));
        
        menu.setBounds(755,5,250,720);
        menu.setLayout(null);
        
        levelNumber.setBounds(70,10,150,20);
        levelNumber.setFont(new Font("Arial", Font.PLAIN, 25));
        
        
        levelImage.setBounds(50, 40, 150, 150);
        
        
        levelDescription.setBounds(20,210,200,30);
        levelDescription.setFont(new Font("Arial", Font.PLAIN, 15));
        
        
        levelTargetTitle.setBounds(20,260,50,25);
        levelTargetTitle.setFont(new Font("Arial", Font.BOLD, 20));
        levelTargetTitle.setText("Cel:");
        
        levelTarget.setBounds(90,260,130,25);
        levelTarget.setFont(new Font("Arial", Font.PLAIN, 20));
        
        
        levelGroupTitle.setBounds(20,310,80,25);
        levelGroupTitle.setFont(new Font("Arial", Font.BOLD, 20));
        levelGroupTitle.setText("Grupa:");
        
        levelGroup.setBounds(110,310,70,25);
        levelGroup.setFont(new Font("Arial", Font.PLAIN, 20));
        
        
        levelBagsText.setBounds(20,385,60,40);
        levelBagsText.setFont(new Font("Arial", Font.BOLD, 40));
        levelBagsText.setText("0 X");
        
        levelBagsIco.setBounds(100,370,37,60);
        levelBagsIco.setIcon(new ImageIcon(Images.get_blood_bag_full()));
        
        levelBagFilling.setBounds(157,370,37,60);
        
        
        start.setBounds(20,450,200,60);
        start.setFont(new Font("Arial", Font.BOLD, 40));
        start.setText("Start");
        
        exit.setBounds(20,530,200,60);
        exit.setFont(new Font("Arial", Font.BOLD, 40));
        exit.setText("Exit");
        
        test.setBounds(20,630,200,50);
        test.setFont(new Font("Arial", Font.BOLD, 40));
        
        add(game);
        add(menu);
        
        menu.add(levelNumber);
        menu.add(levelImage);
        menu.add(levelDescription);
        menu.add(levelTargetTitle);
        menu.add(levelTarget);
        menu.add(levelGroupTitle);
        menu.add(levelGroup);
        menu.add(levelBagsText);
        menu.add(levelBagsIco);
        menu.add(levelBagFilling);
        menu.add(start);
        menu.add(exit);
        
        menu.add(test);
        
        start.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.gameStatus.set_started();
            }
        });
        
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.gameStatus.reset();
                OperacjaKrew.gameStatus.droplet.reset();
                game.repaint();
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "START");
            }
        });
        
        test.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.gameStatus.blood_collected();
            }
        });
        
        cycler.start();
        
        addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent ke)
            {
		if(ke.getKeyCode() == ke.VK_LEFT)
                {
                    OperacjaKrew.gameStatus.move_doctor_left();
                }
		if(ke.getKeyCode() == ke.VK_RIGHT)
                {
                    OperacjaKrew.gameStatus.move_doctor_right();
		}
            }
	});
    }
}

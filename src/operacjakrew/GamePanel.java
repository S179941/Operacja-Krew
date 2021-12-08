package operacjakrew;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class GamePanel extends JPanel{
    
    JLabel label = new JLabel(Scenarios.get_description(1));
    JPanel game = new JPanel();
    JPanel menu = new JPanel();
    JButton button = new JButton(OperacjaKrew.gameStatus.get_patient_bloodtype_String());
    JLabel description = new JLabel(Scenarios.get_description(OperacjaKrew.gameStatus.get_current_level()));
    
    JLabel filled_bag = new JLabel();
    
    GamePanel() {
        setLayout(null);
        game.setBounds(5,5,750,720);
        game.setLayout(null);
        game.setBorder(BorderFactory.createLineBorder(Color.black));
        
        menu.setBounds(755,5,250,720);
        menu.setLayout(null);
        
        button.setBounds(10,30,100,100);
        menu.add(button);
        
        description.setBounds(10,140,150,20);
        menu.add(description);
        
        filled_bag.setBounds(100,100,320,520);
        filled_bag.setIcon(new ImageIcon(OperacjaKrew.gameStatus.get_bag_filling()));
        game.add(filled_bag);
        
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //GameStatus.reset();
                OperacjaKrew.gameStatus.blood_collected();
                button.setText(OperacjaKrew.gameStatus.get_patient_bloodtype_String());
                filled_bag.setIcon(new ImageIcon(OperacjaKrew.gameStatus.get_bag_filling()));
                description.setText(Scenarios.get_description(OperacjaKrew.gameStatus.get_current_level()));
                if(OperacjaKrew.gameStatus.isFinished())
                {
                    OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "ENDING");
                }
                //System.out.printf(GameStatus.get_patient_bloodtype_String());
            }
        });
        
        add(game);
        add(menu);
        
        
    }
}

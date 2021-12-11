/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
All Rights Reserved 2021
*/

package operacjakrew;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Klasa służąca do obsługi panelu, w którym toczy się gra
 * @author Michał Ostrowski
 */
public class GamePanel extends JPanel {
    /** Stworzenie panelu do rysowania gracza i kropli */
    JPanel game = new JPanel()
    {
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;
            g2d.drawImage(OperacjaKrew.gameStatus.droplet.get_Image(),OperacjaKrew.gameStatus.droplet.get_xPosition(),OperacjaKrew.gameStatus.droplet.get_yPosition(),null);
            g2d.drawImage(Images.get_doctor(),OperacjaKrew.gameStatus.get_doctor_x(),OperacjaKrew.gameStatus.get_doctor_y(), null);
	}
    };
    /** Stworzenie panelu pełniącego funkcję menu */
    JPanel menu = new JPanel();
    /** Tekst z numerem poziomu */
    JLabel levelNumber = new JLabel();
    /** Obrazek poziomu */
    JLabel levelImage = new JLabel();
    /** Opis poziomu */
    JLabel levelDescription = new JLabel();
    /** Tekst "Cel" */
    JLabel levelTargetTitle = new JLabel();
    /** Docelowa ilość krwi */
    JLabel levelTarget = new JLabel();
    /** Tekst "Grupa" */
    JLabel levelGroupTitle = new JLabel();
    /** Grupa krwi pacjenta */
    JLabel levelGroup = new JLabel();
    /** Zebrana liczba jednostek */
    JLabel levelBagsText = new JLabel();
    /** Ikona pełnego pojemnika */
    JLabel levelBagsIco = new JLabel();
    /** Ikona ilustrująca wypełnienie pojemnika */
    JLabel levelBagFilling = new JLabel();
    /** Przycisk Start */
    JButton start = new JButton();
    /** Przycisk do Exit */
    JButton exit = new JButton();
    
    /**
     * Funkcja odświeżająca całą zawartość panelu
     */
    ActionListener repainter = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
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
                   detect_collision();
                   game.repaint();
               }
               
               levelNumber.setText(new String().format("Poziom %d",OperacjaKrew.gameStatus.get_current_level()));
               levelImage.setIcon(new ImageIcon(Scenarios.get_picture(OperacjaKrew.gameStatus.get_current_level())));
               levelDescription.setText(Scenarios.get_description(OperacjaKrew.gameStatus.get_current_level()));
               levelTarget.setText(new String().format("%d jednostki",Scenarios.get_target(OperacjaKrew.gameStatus.get_current_level())));
               levelGroup.setText(OperacjaKrew.gameStatus.get_patient_bloodtype_String());
               levelBagsText.setText(new String().format("%d X",OperacjaKrew.gameStatus.get_bags_filled()));
               levelBagFilling.setIcon(new ImageIcon(OperacjaKrew.gameStatus.get_bag_filling()));
               game.repaint();
           }
           grabFocus();
        }
    };
    
    /**
     * Funkcja służąca do sprawdzania, czy gracz styka się z kroplą
     */
    void detect_collision()
    {
	Rectangle doctorBox = new Rectangle(OperacjaKrew.gameStatus.get_doctor_x(),OperacjaKrew.gameStatus.get_doctor_y(),124,150);
	Rectangle dropletBox = new Rectangle(OperacjaKrew.gameStatus.droplet.get_xPosition(),OperacjaKrew.gameStatus.droplet.get_yPosition(),57,80);
		
	if(dropletBox.intersects(doctorBox))
        {
            OperacjaKrew.gameStatus.blood_collected();
	}
    }
    
    /** Timer cyklicznie wywołująca odświeżenie panelu */
    javax.swing.Timer cycler = new javax.swing.Timer(5,repainter);
    
    /**
     * Konstruktor - rozłożenie wszystkiech elementów na ekranie
     */
    GamePanel() {
        /** Aby można było użyć setBounds */
        setLayout(null);
        /** Aby działało przechwytywanie przycisków */
        setFocusable(true);
        /** Pozycja części z grą */
        game.setBounds(5,5,750,720);
        /** Aby rozkładać elementy ręcznie */
        game.setLayout(null);
        /** Obrysowanie części z grą */
        game.setBorder(BorderFactory.createLineBorder(Color.black));
        /** Pozycja menu */
        menu.setBounds(755,5,250,720);
        /** Rozłożyć menu ręcznie */
        menu.setLayout(null);
        
        /** Pozycja numeru poziomu */
        levelNumber.setBounds(70,10,150,20);
        /** Czcionka numeru poziomu */
        levelNumber.setFont(new Font("Arial", Font.PLAIN, 25));
        
        /** Pozycja obrazka poziomu */
        levelImage.setBounds(50, 40, 150, 150);
        
        /** Pozycja opisu poziomu */
        levelDescription.setBounds(20,210,200,30);
        /** Czcionka opisu poziomu */
        levelDescription.setFont(new Font("Arial", Font.PLAIN, 15));
        
        /** Pozycja tekstu "Cel:" */
        levelTargetTitle.setBounds(20,260,50,25);
        /** Czcionka tesktu "Cel:" */
        levelTargetTitle.setFont(new Font("Arial", Font.BOLD, 20));
        /** Ustawienie tekstu "Cel:" */
        levelTargetTitle.setText("Cel:");
        /** Ustawienie pozycji docelowej liczby */
        levelTarget.setBounds(90,260,130,25);
        /** Ustawienie czcionki docelowej liczby */
        levelTarget.setFont(new Font("Arial", Font.PLAIN, 20));
        
        /** Pozycja tekstu "Grupa:" */
        levelGroupTitle.setBounds(20,310,80,25);
        /** Czcionka tekstu "Grupa:" */
        levelGroupTitle.setFont(new Font("Arial", Font.BOLD, 20));
        /** Ustawienie tekstu "Grupa:" */
        levelGroupTitle.setText("Grupa:");
        /** Ustawienie pozycji grupy pacjenta */
        levelGroup.setBounds(110,310,70,25);
        /** Ustawienie czcionki grupy pacjenta */
        levelGroup.setFont(new Font("Arial", Font.PLAIN, 20));
        
        /** Ustawienie pozycji liczby zebranych jednostek */
        levelBagsText.setBounds(20,385,60,40);
        /** Ustawienie czcionki liczby zebranych jednostek */
        levelBagsText.setFont(new Font("Arial", Font.BOLD, 40));
        
        /** Ustawienie pozycji ikonki jednostek */
        levelBagsIco.setBounds(100,370,37,60);
        /** Ustawienie ikonki jednostek */
        levelBagsIco.setIcon(new ImageIcon(Images.get_blood_bag_full()));
        
        /** Ustawienie pozycji ikonki aktualnie napełnianego pojemnika */
        levelBagFilling.setBounds(157,370,37,60);
        
        /** Ustawienie pozycji przycisku Start */
        start.setBounds(20,450,200,60);
        /** Ustawienie czcionki przycisku Start */
        start.setFont(new Font("Arial", Font.BOLD, 40));
        /** Ustawienie tekstu na przycisku Start */
        start.setText("Start");
        
        /** Ustawienie pozycji przycisku Exit */
        exit.setBounds(20,530,200,60);
        /** Ustawienie czcionki przycisku Start */
        exit.setFont(new Font("Arial", Font.BOLD, 40));
        /** Ustawienie tekstu na przycisku Start */
        exit.setText("Exit");
        
        /** Dadanie części z graczem i kroplą do panelu */
        add(game);
        /** Dodanie części z menu do panelu */
        add(menu);
        
        /** Dodanie numeru poziomu do menu */
        menu.add(levelNumber);
        /** Dodanie obrazka poziomu do menu */
        menu.add(levelImage);
        /** Dodanie opisu poziomu do menu */
        menu.add(levelDescription);
        /** Dodanie tekstu "Cel" do menu */
        menu.add(levelTargetTitle);
        /** Dodanie docelowej ilości krwi do menu */
        menu.add(levelTarget);
        /** Dodanie tekstu "Grupa" do menu */
        menu.add(levelGroupTitle);
        /** Dodanie grupy bieżącego pacjenta do menu */
        menu.add(levelGroup);
        /** Dodanie ilości zebranych jednostek do menu */
        menu.add(levelBagsText);
        /** Dodanie ikonki jednostki krwi do menu */
        menu.add(levelBagsIco);
        /** Dodanie ikonki pokazujacej stan wypełnienia pojemnika do menu */
        menu.add(levelBagFilling);
        /** Dodanie przycisku Start do menu */
        menu.add(start);
        /** Dodanie przycisku Exit do menu */
        menu.add(exit);
        
        /** Dodanie listenera do przycisku Start */
        start.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.gameStatus.set_started();
            }
        });
        /** Dodanie listenera do przycisku Exit */
        exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.gameStatus.reset();
                OperacjaKrew.gameStatus.droplet.reset();
                game.repaint();
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "START");
            }
        });
        /** Uruchomienie timera odświeżającego panel gry */ 
        cycler.start();
        /** Dodanie sterowania klawiaturą do gry */
        addKeyListener(new KeyAdapter()
        {
            @Override
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

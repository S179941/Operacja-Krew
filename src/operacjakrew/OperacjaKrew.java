package operacjakrew;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class OperacjaKrew {  
    public static void main(String[] args) {
        
        Droplet kropelka = new Droplet();
        Droplet kropelka2 = new Droplet();
        
        System.out.println("Pierwsza kropelka");
        System.out.println(kropelka.get_xPosition());
        System.out.println(kropelka.get_yPosition());
        System.out.println(kropelka.get_bloodType());
        kropelka.move_down();
        System.out.println(kropelka.get_yPosition());
        
        System.out.println("Druga kropelka");
        System.out.println(kropelka2.get_xPosition());
        System.out.println(kropelka2.get_yPosition());
        System.out.println(kropelka2.get_bloodType());
        kropelka2.move_down();
        System.out.println(kropelka2.get_yPosition());
        
        JFrame frame = new JFrame();
        
        JPanel pane = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(Scenarios.get_picture(1), 100, 100, null);
            }
        };
        frame.add(pane);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1024,768);
        frame.setVisible(true);
       
    }
    
}

package operacjakrew;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class GamePanel extends JPanel{
    
    JLabel label = new JLabel(Scenarios.get_description(1));
    JPanel game = new JPanel();
    JPanel menu = new JPanel();
    JButton button = new JButton("Exit");
    JLabel description = new JLabel(Scenarios.get_description(1));
    
    GamePanel() {
        setLayout(null);
        game.setBounds(5,5,750,720);
        game.setBorder(BorderFactory.createLineBorder(Color.black));
        
        menu.setBounds(755,5,250,720);
        menu.setLayout(null);
        
        button.setBounds(10,30,100,100);
        
        menu.add(button);
        menu.add(description);
        
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "ENDING");
            }
        });
        
        add(game);
        add(menu);
    }
}

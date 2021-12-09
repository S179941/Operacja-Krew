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

public class EndingPanel extends JPanel {
    
    JButton credits = new JButton("");
    
    JPanel menu = new JPanel();
    
    EndingPanel() {
        
        setLayout(null);
        
        menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
        menu.setBounds(350,550,310,110);
        add(menu);
        
        credits.setIcon(new ImageIcon(Images.get_button_credits()));
        
        menu.add(credits);
        
        credits.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.gameStatus.clear_finished();
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "CREDITS");
            }
        });
    }
    
    public void paintComponent(Graphics g) {
        
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		setFocusable(true);
		
		g2d.drawImage(Images.get_ending(), 0,0, null);
		repaint();
    }
}

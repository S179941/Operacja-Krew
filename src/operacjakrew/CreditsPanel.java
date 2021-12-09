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

public class CreditsPanel extends JPanel {
    
    JButton start = new JButton("");
    
    JPanel menu = new JPanel();
    
    CreditsPanel() {
        
        setLayout(null);
        
        menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
        menu.setBounds(350,550,310,110);
        add(menu);
        
        start.setIcon(new ImageIcon(Images.get_button_start()));
        
        menu.add(start);
        
        start.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "START");
            }
        });
    }
    
    public void paintComponent(Graphics g) {
        
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		setFocusable(true);
		
		g2d.drawImage(Images.get_credits(), 0,0, null);
		repaint();
    }
}

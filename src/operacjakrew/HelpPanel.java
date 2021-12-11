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
 * Klasa służąca do obsługi panelu z zakończenim gry
 * @author Michał Ostrowski
 */

public class HelpPanel extends JPanel {
    /** Przycisk kierujacy do panelu z grą */
    JButton start = new JButton("");
    /** Panel do przechowywania przycisków */
    JPanel menu = new JPanel();
    
    HelpPanel() {
        /** Aby można było użyć setBounds */
        setLayout(null);
        /** Ustawienie pozycji menu */
        menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
        menu.setBounds(350,550,310,110);
        add(menu);
        /** Dodanie przycisku z ikonką */
        start.setIcon(new ImageIcon(Images.get_button_start()));
        menu.add(start);
        /** Listener do obsługi przycisku */
        start.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "GRA");
            }
        });
    }
    /** Nadpisanie funkcji paintComponent aby ustawić tło */
    @Override
    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D)g;
	setFocusable(true);
		
	g2d.drawImage(Images.get_help(), 0,0, null);
	repaint();
    }
}

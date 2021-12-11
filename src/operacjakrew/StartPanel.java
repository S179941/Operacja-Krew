/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
All Rights Reserved 2021
*/

package operacjakrew;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Klasa służąca do obsługi panelu z głównym menu
 * @author Michał Ostrowski
 */

public class StartPanel extends JPanel {
    /** Przycisk kierujacy do panelu z instrukcją */
    JButton start = new JButton("");
    /** Przycisk kierujący do panelu z creditsami */
    JButton credits = new JButton("");
    /** Panel do przechowywania przycisków */
    JPanel menu = new JPanel();
    
    StartPanel() {
        /** Aby można było użyć setBounds */
        setLayout(null);
        /** Ustawienie pozycji menu */
        menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
        menu.setBounds(350,450,310,220);
        add(menu);
        /** Dodanie przycisków z ikonkami */
        start.setIcon(new ImageIcon(Images.get_button_start()));
        credits.setIcon(new ImageIcon(Images.get_button_credits()));
        menu.add(start);
        menu.add(credits);
        /** Listener do przycisku Start */
        start.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "HELP");
            }
        });
        /** Listener do przycisku Credits */
        credits.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "CREDITS");
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
		
	g2d.drawImage(Images.get_start(), 0,0, null);
	repaint();
    }
}

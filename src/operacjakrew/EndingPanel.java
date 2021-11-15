package operacjakrew;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class EndingPanel extends JPanel {
    
    JButton credits = new JButton("");
    
    JPanel menu = new JPanel();
    
    EndingPanel() {
        
        menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
        add(menu);
        
        credits.setIcon(new ImageIcon(Images.get_button_credits()));
        
        menu.add(credits);
        
        credits.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
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

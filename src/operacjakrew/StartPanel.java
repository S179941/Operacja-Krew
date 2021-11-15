package operacjakrew;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StartPanel extends JPanel {
    
    JButton start = new JButton("");
    JButton credits = new JButton("");
    
    JPanel menu = new JPanel();
    
    StartPanel() {
        
        menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
        add(menu);
        
        start.setIcon(new ImageIcon(Images.get_button_start()));
        credits.setIcon(new ImageIcon(Images.get_button_credits()));
        
        menu.add(start);
        menu.add(credits);
        
        start.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                OperacjaKrew.cardlayout.show(OperacjaKrew.panels, "HELP");
            }
        });
        
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
		
		g2d.drawImage(Images.get_start(), 0,0, null);
		repaint();
    }
}

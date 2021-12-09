/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
All Rights Reserved 2021
*/

package operacjakrew;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class OperacjaKrew extends JFrame {
    
    //Calling constructors for all panels of game
    public static Random rand = new Random();
    public static GameStatus gameStatus = new GameStatus();
        
    static StartPanel startpanel = new StartPanel();
    static HelpPanel helppanel = new HelpPanel();
    static GamePanel gamepanel = new GamePanel();
    static EndingPanel endingpanel = new EndingPanel();
    static CreditsPanel creditspanel = new CreditsPanel();
    
    static CardLayout cardlayout = new CardLayout();
    static JPanel panels = new JPanel();
    
    
    OperacjaKrew() {
        
        panels.setLayout(cardlayout);
        panels.add(startpanel, "START");
        panels.add(helppanel, "HELP");
        panels.add(gamepanel, "GRA");
        panels.add(endingpanel, "ENDING");
        panels.add(creditspanel, "CREDITS");
        
        cardlayout.show(panels, "START");
        add(panels);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024,768);
        setResizable(false);
        setIconImage(Images.get_droplet());
        setTitle("Operacja Krew");
        setVisible(true);
    }
    
    public static void main(String[] args) {
       new OperacjaKrew();
    }
    
}

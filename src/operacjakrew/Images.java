/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
Some Rights Reserved 2021

Some images from Flaticon.com
Licence Free with Attribution
*/

package operacjakrew;

import java.awt.*;
import javax.swing.*;

public class Images {
    
    //Bloodbags
    private static final Image blood_bag_empty = new ImageIcon("assets/blood_bags/blood_bag_empty.png").getImage();
    private static final Image blood_bag_1 = new ImageIcon("assets/blood_bags/blood_bag_1.png").getImage();
    private static final Image blood_bag_2 = new ImageIcon("assets/blood_bags/blood_bag_2.png").getImage();
    private static final Image blood_bag_full = new ImageIcon("assets/blood_bags/blood_bag_full.png").getImage();
    
    //Blood droplets
    private static final Image droplet_0m = new ImageIcon("assets/droplets/droplet_0m.png").getImage(); //0Rh-
    private static final Image droplet_0p = new ImageIcon("assets/droplets/droplet_0p.png").getImage(); //0Rh+
    private static final Image droplet_Am = new ImageIcon("assets/droplets/droplet_Am.png").getImage(); //ARh-
    private static final Image droplet_Ap = new ImageIcon("assets/droplets/droplet_Ap.png").getImage(); //ARh+
    private static final Image droplet_Bm = new ImageIcon("assets/droplets/droplet_Bm.png").getImage(); //BRh-
    private static final Image droplet_Bp = new ImageIcon("assets/droplets/droplet_Bp.png").getImage(); //BRh+
    private static final Image droplet_ABm = new ImageIcon("assets/droplets/droplet_ABm.png").getImage(); //ABRh-
    private static final Image droplet_ABp = new ImageIcon("assets/droplets/droplet_ABp.png").getImage(); //ABRh+
    
    //Levels/scenarios
    private static final Image sc_1 = new ImageIcon("assets/scenarios/sc_1.png").getImage();
    private static final Image sc_2 = new ImageIcon("assets/scenarios/sc_2.png").getImage();
    private static final Image sc_3 = new ImageIcon("assets/scenarios/sc_3.png").getImage();
    private static final Image sc_4 = new ImageIcon("assets/scenarios/sc_4.png").getImage();
    private static final Image sc_5 = new ImageIcon("assets/scenarios/sc_5.png").getImage();
    
    //Buttons
    private static final Image button_start = new ImageIcon("assets/buttons/button_start.png").getImage();
    private static final Image button_credits = new ImageIcon("assets/buttons/button_credits.png").getImage();
    
    //Others
    private static final Image doctor = new ImageIcon("assets/others/doctor.png").getImage();
    private static final Image droplet = new ImageIcon("assets/others/droplet.png").getImage();
    private static final Image help = new ImageIcon("assets/others/help.png").getImage(); //Blood compatibility chart
    private static final Image start = new ImageIcon("assets/others/start.png").getImage(); //Main game menu
    private static final Image ending = new ImageIcon("assets/others/ending.png").getImage(); //Ending panel
    private static final Image credits = new ImageIcon("assets/others/credits.png").getImage(); //Credits panel
    
    //Functions for image access
    
    public static Image get_blood_bag_empty() {
        return blood_bag_empty;
    }
    
    public static Image get_blood_bag_1() {
        return blood_bag_1;
    }
    
    public static Image get_blood_bag_2() {
        return blood_bag_2;
    }
    
    public static Image get_blood_bag_full() {
        return blood_bag_full;
    }
    
    public static Image get_droplet_0m() {
        return droplet_0m;
    }
    
    public static Image get_droplet_0p() {
        return droplet_0p;
    }
    
    public static Image get_droplet_Am() {
        return droplet_Am;
    }
    
    public static Image get_droplet_Ap() {
        return droplet_Ap;
    }
    
    public static Image get_droplet_Bm() {
        return droplet_Bm;
    }
    
    public static Image get_droplet_Bp() {
        return droplet_Bp;
    }
    
    public static Image get_droplet_ABm() {
        return droplet_ABm;
    }
    
    public static Image get_droplet_ABp() {
        return droplet_ABp;
    }
    
    public static Image get_sc_1() {
        return sc_1;
    }
    
    public static Image get_sc_2() {
        return sc_2;
    }
    
    public static Image get_sc_3() {
        return sc_3;
    }
    
    public static Image get_sc_4() {
        return sc_4;
    }
    
    public static Image get_sc_5() {
        return sc_5;
    }
    
    public static Image get_button_start() {
        return button_start;
    }
    
    public static Image get_button_credits() {
        return button_credits;
    }
    
    public static Image get_doctor() {
        return doctor;
    }
    
    public static Image get_droplet() {
        return droplet;
    }
    
    public static Image get_help() {
        return help;
    }
    
    public static Image get_start() {
        return start;
    }
    
    public static Image get_ending() {
        return ending;
    }
    
    public static Image get_credits() {
        return credits;
    }
}

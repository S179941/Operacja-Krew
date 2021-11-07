package operacjakrew;

import java.awt.*;
import javax.swing.*;

public class Images {
    
    //Bloodbags
    private final Image blood_bag_empty = new ImageIcon("assets/blood_bags/blood_bag_empty.png").getImage();
    private final Image blood_bag_1 = new ImageIcon("assets/blood_bags/blood_bag_1.png").getImage();
    private final Image blood_bag_2 = new ImageIcon("assets/blood_bags/blood_bag_2.png").getImage();
    private final Image blood_bag_full = new ImageIcon("assets/blood_bags/blood_bag_full.png").getImage();
    
    //Blood droplets
    private final Image droplet_0m = new ImageIcon("assets/droplets/droplet_0m.png").getImage(); //0Rh-
    private final Image droplet_0p = new ImageIcon("assets/droplets/droplet_0p.png").getImage(); //0Rh+
    private final Image droplet_Am = new ImageIcon("assets/droplets/droplet_Am.png").getImage(); //ARh-
    private final Image droplet_Ap = new ImageIcon("assets/droplets/droplet_Ap.png").getImage(); //ARh+
    private final Image droplet_Bm = new ImageIcon("assets/droplets/droplet_Bm.png").getImage(); //BRh-
    private final Image droplet_Bp = new ImageIcon("assets/droplets/droplet_Bp.png").getImage(); //BRh+
    private final Image droplet_ABm = new ImageIcon("assets/droplets/droplet_ABm.png").getImage(); //ABRh-
    private final Image droplet_ABp = new ImageIcon("assets/droplets/droplet_ABp.png").getImage(); //ABRh+
    
    //Levels/scenarios
    private final Image sc_1 = new ImageIcon("assets/scenarios/sc_1.png").getImage();
    private final Image sc_2 = new ImageIcon("assets/scenarios/sc_2.png").getImage();
    private final Image sc_3 = new ImageIcon("assets/scenarios/sc_3.png").getImage();
    private final Image sc_4 = new ImageIcon("assets/scenarios/sc_4.png").getImage();
    private final Image sc_5 = new ImageIcon("assets/scenarios/sc_5.png").getImage();
    
    //Others
    private final Image doctor = new ImageIcon("assets/others/doctor.png").getImage();
    private final Image droplet = new ImageIcon("assets/others/droplet.png").getImage();
    private final Image help = new ImageIcon("assets/others/help.png").getImage(); //Blood compatibility chart
    private final Image ending = new ImageIcon("assets/others/ending.png").getImage(); //Ending panel
    
    //Functions for image access
    
    public Image get_blood_bag_empty() {
        return blood_bag_empty;
    }
    
    public Image get_blood_bag_1() {
        return blood_bag_1;
    }
    
    public Image get_blood_bag_2() {
        return blood_bag_2;
    }
    
    public Image get_blood_bag_full() {
        return blood_bag_empty;
    }
    
    public Image get_droplet_0m() {
        return droplet_0m;
    }
    
    public Image get_droplet_0p() {
        return droplet_0p;
    }
    
    public Image get_droplet_Am() {
        return droplet_Am;
    }
    
    public Image get_droplet_Ap() {
        return droplet_Ap;
    }
    
    public Image get_droplet_Bm() {
        return droplet_Bm;
    }
    
    public Image get_droplet_Bp() {
        return droplet_Bp;
    }
    
    public Image get_droplet_ABm() {
        return droplet_ABm;
    }
    
    public Image get_droplet_ABp() {
        return droplet_ABp;
    }
    
    public Image get_sc_1() {
        return sc_1;
    }
    
    public Image get_sc_2() {
        return sc_2;
    }
    
    public Image get_sc_3() {
        return sc_3;
    }
    
    public Image get_sc_4() {
        return sc_4;
    }
    
    public Image get_sc_5() {
        return sc_5;
    }
    
    public Image get_doctor() {
        return doctor;
    }
    
    public Image get_droplet() {
        return droplet;
    }
    
    public Image get_help() {
        return help;
    }
    
    public Image get_ending() {
        return ending;
    }
}

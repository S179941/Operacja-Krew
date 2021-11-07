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
}

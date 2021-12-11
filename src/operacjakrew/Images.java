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

/**
 * Klasa statyczna służąca do przechowywania obrazków
 * @author Michał Ostrowski
 */

public class Images {
    
    /** Pusty pojemnik na krew */
    private static final Image blood_bag_empty = new ImageIcon("assets/blood_bags/blood_bag_empty.png").getImage();
    /** Pojemnik wypełniony w 1/3 */
    private static final Image blood_bag_1 = new ImageIcon("assets/blood_bags/blood_bag_1.png").getImage();
    /** Pojemnik wypełniony w 2/3 */
    private static final Image blood_bag_2 = new ImageIcon("assets/blood_bags/blood_bag_2.png").getImage();
    /** Pełen pojemnik na krew */
    private static final Image blood_bag_full = new ImageIcon("assets/blood_bags/blood_bag_full.png").getImage();
    
    /** Kropla 0Rh- */
    private static final Image droplet_0m = new ImageIcon("assets/droplets/droplet_0m.png").getImage();
    /** Kropla 0Rh+ */
    private static final Image droplet_0p = new ImageIcon("assets/droplets/droplet_0p.png").getImage();
    /** Kropla ARh- */
    private static final Image droplet_Am = new ImageIcon("assets/droplets/droplet_Am.png").getImage();
    /** Kropla ARh+ */
    private static final Image droplet_Ap = new ImageIcon("assets/droplets/droplet_Ap.png").getImage();
    /** Kropla BRh- */
    private static final Image droplet_Bm = new ImageIcon("assets/droplets/droplet_Bm.png").getImage();
    /** Kropla BRh+ */
    private static final Image droplet_Bp = new ImageIcon("assets/droplets/droplet_Bp.png").getImage();
    /** Kropla ABRh- */
    private static final Image droplet_ABm = new ImageIcon("assets/droplets/droplet_ABm.png").getImage();
    /** Kropla ABRh+ */
    private static final Image droplet_ABp = new ImageIcon("assets/droplets/droplet_ABp.png").getImage();
    
    /** Obrazek poziomu 1 */
    private static final Image sc_1 = new ImageIcon("assets/scenarios/sc_1.png").getImage();
    /** Obrazek poziomu 2 */
    private static final Image sc_2 = new ImageIcon("assets/scenarios/sc_2.png").getImage();
    /** Obrazek poziomu 3 */
    private static final Image sc_3 = new ImageIcon("assets/scenarios/sc_3.png").getImage();
    /** Obrazek poziomu 4 */
    private static final Image sc_4 = new ImageIcon("assets/scenarios/sc_4.png").getImage();
    /** Obrazek poziomu 5 */
    private static final Image sc_5 = new ImageIcon("assets/scenarios/sc_5.png").getImage();
    
    /** Obrazek przycisku Start */
    private static final Image button_start = new ImageIcon("assets/buttons/button_start.png").getImage();
    /** Obrazek przycisku Credits */
    private static final Image button_credits = new ImageIcon("assets/buttons/button_credits.png").getImage();
    
    /** Obrazek doktora/postaci */
    private static final Image doctor = new ImageIcon("assets/others/doctor.png").getImage();
    /** Obrazek kropli bez oznaczeń, jako favicon */
    private static final Image droplet = new ImageIcon("assets/others/droplet.png").getImage();
    /** Tło panelu z instrukcją */
    private static final Image help = new ImageIcon("assets/others/help.png").getImage();
    /** Tło panelu głównego */
    private static final Image start = new ImageIcon("assets/others/start.png").getImage();
    /** Tło panelu z zakończeniem */
    private static final Image ending = new ImageIcon("assets/others/ending.png").getImage();
    /** Tło panelu z creditsami */
    private static final Image credits = new ImageIcon("assets/others/credits.png").getImage();
    
    /**
     * Pobierz obrazek pustego pojemnika
     * @return Image
     */
    public static Image get_blood_bag_empty() {
        return blood_bag_empty;
    }
    
    /**
     * Pobierz obrazek pojemnika wypełnionego w 1/3
     * @return Image
     */
    public static Image get_blood_bag_1() {
        return blood_bag_1;
    }
    
    /**
     * Pobierz obrazek pojemnika wypełnionego w 2/3
     * @return Image
     */
    public static Image get_blood_bag_2() {
        return blood_bag_2;
    }
    
    /**
     * Pobierz obrazek pełnego pojemnika
     * @return Image
     */
    public static Image get_blood_bag_full() {
        return blood_bag_full;
    }
    
    /**
     * Pobierz obrazek kropli 0Rh-
     * @return Image
     */
    public static Image get_droplet_0m() {
        return droplet_0m;
    }
    
    /**
     * Pobierz obrazek kropli 0Rh+
     * @return Image
     */
    public static Image get_droplet_0p() {
        return droplet_0p;
    }
    
    /**
     * Pobierz obrazek kropli ARh-
     * @return Image
     */
    public static Image get_droplet_Am() {
        return droplet_Am;
    }
    
    /**
     * Pobierz obrazek kropli ARh+
     * @return Image
     */
    public static Image get_droplet_Ap() {
        return droplet_Ap;
    }
    
    /**
     * Pobierz obrazek kropli BRh-
     * @return Image
     */
    public static Image get_droplet_Bm() {
        return droplet_Bm;
    }
    
    /**
     * Pobierz obrazek kropli BRh+
     * @return Image
     */
    public static Image get_droplet_Bp() {
        return droplet_Bp;
    }
    
    /**
     * Pobierz obrazek kropli ABRh-
     * @return Image
     */
    public static Image get_droplet_ABm() {
        return droplet_ABm;
    }
    
    /**
     * Pobierz obrazek kropli ABRh+
     * @return Image
     */
    public static Image get_droplet_ABp() {
        return droplet_ABp;
    }
    
    /**
     * Pobierz obrazek poziomu 1
     * @return Image
     */
    public static Image get_sc_1() {
        return sc_1;
    }
    
    /**
     * Pobierz obrazek poziomu 2
     * @return Image
     */
    public static Image get_sc_2() {
        return sc_2;
    }
    
    /**
     * Pobierz obrazek poziomu 3
     * @return Image
     */
    public static Image get_sc_3() {
        return sc_3;
    }
    
    /**
     * Pobierz obrazek poziomu 4
     * @return Image
     */
    public static Image get_sc_4() {
        return sc_4;
    }
    
    /**
     * Pobierz obrazek poziomu 5
     * @return Image
     */
    public static Image get_sc_5() {
        return sc_5;
    }
    
    /**
     * Pobierz obrazek przycisku Start
     * @return Image
     */
    public static Image get_button_start() {
        return button_start;
    }
    
    /**
     * Pobierz obrazek przycisku Credits
     * @return Image
     */
    public static Image get_button_credits() {
        return button_credits;
    }
    
    /**
     * Pobierz obrazek doktora/postaci
     * @return Image
     */
    public static Image get_doctor() {
        return doctor;
    }
    
    /**
     * Pobierz obrazek zwykłej kropli
     * @return Image
     */
    public static Image get_droplet() {
        return droplet;
    }
    
    /**
     * Pobierz tło panelu z instrukcją
     * @return Image
     */
    public static Image get_help() {
        return help;
    }
    
    /**
     * Pobierz tło panelu głównego
     * @return Image
     */
    public static Image get_start() {
        return start;
    }
    
    /**
     * Pobierz tło panelu z zakończeniem
     * @return Image
     */
    public static Image get_ending() {
        return ending;
    }
    
    /**
     * Pobierz tło panelu z creditsami
     * @return Image
     */
    public static Image get_credits() {
        return credits;
    }
}

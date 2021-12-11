/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
All Rights Reserved 2021
*/

package operacjakrew;

import java.awt.*;

/**
 * Klasa statyczna służąca do przechowywania scenariuszy poziomów
 * @author Michał Ostrowski
 */

public class Scenarios {
    /** Poziom 1 */
    private static final class Scenario1 {
        /** Docelowa ilosć krwi */
        static Integer target = 1;
        /** Opis poziomu */
        static String description = "Zewnętrzne usztywnienie nogi";
        /** Obrazek poziomu */
        static Image picture = Images.get_sc_1();
    }
    /** Poziom 2 */
    private static final class Scenario2 {
        /** Docelowa ilosć krwi */
        static Integer target = 2;
        /** Opis poziomu */
        static String description = "Anemia";
        /** Obrazek poziomu */
        static Image picture = Images.get_sc_2();
    }
    /** Poziom 3 */
    private static final class Scenario3 {
        /** Docelowa ilosć krwi */
        static Integer target = 4;
        /** Opis poziomu */
        static String description = "Wypadek komunikacyjny";
        /** Obrazek poziomu */
        static Image picture = Images.get_sc_3();
    }
    /** Poziom 4 */
    private static final class Scenario4 {
        /** Docelowa ilosć krwi */
        static Integer target = 6;
        /** Opis poziomu */
        static String description = "Przeszczep serca";
        /** Obrazek poziomu */
        static Image picture = Images.get_sc_4();
    }
    /** Poziom 5 */
    private static final class Scenario5 {
        /** Docelowa ilosć krwi */
        static Integer target = 10;
        /** Opis poziomu */
        static String description = "Przeszczep wątroby";
        /** Obrazek poziomu */
        static Image picture = Images.get_sc_5();
    }
    
    /**
     * Pobierz ilość krwi do ukończenia pzoiomu
     * @param sc numer poziomu
     * @return ilość jednostek krwi
     */
    public static Integer get_target(Integer sc) {
        
        Integer target = 0;
        
        switch(sc)
        {
            case 1:
                target = Scenario1.target;
                break;
            case 2:
                target = Scenario2.target;
                break;
            case 3:
                target = Scenario3.target;
                break;
            case 4:
                target = Scenario4.target;
                break;
            case 5:
                target = Scenario5.target;
                break;         
        }
        
        return target;
    }
    
    /**
     * Pobierz opis poziomu
     * @param sc numer poziomu
     * @return opis poziomu
     */
    public static String get_description(Integer sc) {
        
        String description = "";
        
        switch(sc)
        {
            case 1:
                description = Scenario1.description;
                break;
            case 2:
                description = Scenario2.description;
                break;
            case 3:
                description = Scenario3.description;
                break;
            case 4:
                description = Scenario4.description;
                break;
            case 5:
                description = Scenario5.description;
                break;         
        }
        
        return description;
    }
    
    /**
     * Pobierz obrazek poziomu
     * @param sc numer poziomu
     * @return obrazek poziomu
     */
    public static Image get_picture(Integer sc) {
        
        //Droplet as a dummy picture
        Image picture = Images.get_droplet();
        
        switch(sc)
        {
            case 1:
                picture = Scenario1.picture;
                break;
            case 2:
                picture = Scenario2.picture;
                break;
            case 3:
                picture = Scenario3.picture;
                break;
            case 4:
                picture = Scenario4.picture;
                break;
            case 5:
                picture = Scenario5.picture;
                break;         
        }
        
        return picture;
    }
}

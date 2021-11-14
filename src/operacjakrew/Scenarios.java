package operacjakrew;

import java.awt.*;

public class Scenarios {
    
    private static final class Scenario1 {
        
        static Integer target = 1;
        static String description = "Zewnętrzne usztywnienie nogi";
        static Image picture = Images.get_sc_1();
    }
    
    private static final class Scenario2 {
        static Integer target = 2;
        static String description = "Anemia";
        static Image picture = Images.get_sc_2();
    }
    
    private static final class Scenario3 {
        static Integer target = 4;
        static String description = "Wypadek komunikacyjny";
        static Image picture = Images.get_sc_3();
    }
    
    private static final class Scenario4 {
        static Integer target = 6;
        static String description = "Przeszczep serca";
        static Image picture = Images.get_sc_4();
    }
    
    private static final class Scenario5 {
        static Integer target = 10;
        static String description = "Przeszczep wątroby";
        static Image picture = Images.get_sc_5();
    }
    
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

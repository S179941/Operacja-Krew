package operacjakrew;

import java.awt.*;
import javax.swing.*;

public class GameStatus {
    
    private static Integer currentLevel = 1;
    private static Integer dropletsCollected = 0;
    private static Integer bagsFilled = 0;
    
    private static BloodType patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
    
    private static Boolean isStarted = false;
    
    public static void blood_collected()
    {
        dropletsCollected++;
        
        if(dropletsCollected == 3)
        {
            bagsFilled++;
            dropletsCollected = 0;
        }
        
        if(bagsFilled.equals(Scenarios.get_target(currentLevel)))
        {
            currentLevel++;
            dropletsCollected = 0;
            bagsFilled = 0;
            isStarted = false;
            
            patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
        }
    }
    
    public static void wrong_blood()
    {
        dropletsCollected = 0;
    }
    
    public static void reset()
    {
        currentLevel = 1;
        dropletsCollected = 0;
        bagsFilled = 0;
        isStarted = false;
        
        patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
    }
    
    public static BloodType get_patient_bloodtype()
    {
        return patientType;
    }
    
    public static Integer get_bags_filled()
    {
        return bagsFilled;
    }
    
    public static Image get_bag_filling()
    {
        Image filling = Images.get_blood_bag_empty();
        
        switch(dropletsCollected)
        {
            case 0:
                filling = Images.get_blood_bag_empty();
                break;
            case 1:
                filling = Images.get_blood_bag_1();
                break;
            case 2:
                filling = Images.get_blood_bag_2();
                break;
            case 3:
                filling = Images.get_blood_bag_full();
                break;             
        }
        return filling;
    }
    
    public static Integer get_current_level()
    {
        return currentLevel;
    }
    
    public static String get_patient_bloodtype_String()
    {
        String patientTypeString = "";
        
        switch(patientType)
        {
            case O_minus:
                patientTypeString = "0Rh-";
                break;
            case O_plus:
                patientTypeString = "0Rh+";
                break;
            case A_minus:
                patientTypeString = "ARh-";
                break;
            case A_plus:
                patientTypeString = "ARh+";
                break;
            case B_minus:
                patientTypeString = "BRh-";
                break;
            case B_plus:
                patientTypeString = "BRh-";
                break;
            case AB_minus:
                patientTypeString = "ABRh-";
                break;
            case AB_plus:
                patientTypeString = "ABRh+";
                break;           
        }
        return patientTypeString;
    }
}

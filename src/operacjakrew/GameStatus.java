package operacjakrew;

import java.awt.*;
import javax.swing.*;

public class GameStatus {
    
    private Integer currentLevel;
    private Integer dropletsCollected;
    private Integer bagsFilled;
    
    private BloodType patientType;
    
    private Boolean isStarted;
    private Boolean isFinished;
    
    public GameStatus()
    {
        currentLevel = 1;
        dropletsCollected = 0;
        bagsFilled = 0;
        
        patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
        isStarted = false;
        isFinished = false;
    }
    
    public void blood_collected()
    {
        dropletsCollected++;
        
        if(dropletsCollected == 3)
        {
            bagsFilled++;
            dropletsCollected = 0;
        }
        
        if(bagsFilled.equals(Scenarios.get_target(currentLevel)))
        {
            if(currentLevel == 5)
            {
                isFinished = true;
                reset();
            }
            else
            {
                currentLevel++;
                dropletsCollected = 0;
                bagsFilled = 0;
                isStarted = false;
            
                patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
            }
        }
    }
    
    public void wrong_blood()
    {
        dropletsCollected = 0;
    }
    
    public void reset()
    {
        currentLevel = 1;
        dropletsCollected = 0;
        bagsFilled = 0;
        isStarted = false;
        
        patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
    }
    
    public BloodType get_patient_bloodtype()
    {
        return patientType;
    }
    
    public Integer get_bags_filled()
    {
        return bagsFilled;
    }
    
    public Image get_bag_filling()
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
    
    public Integer get_current_level()
    {
        return currentLevel;
    }
    
    public String get_patient_bloodtype_String()
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
    
    public Boolean isStarted()
    {
        return isStarted;
    }
    
    public Boolean isFinished()
    {
        return isFinished;
    }
    
    public void clear_finished()
    {
        isFinished = false;
    }
}

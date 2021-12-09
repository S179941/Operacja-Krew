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
    
    public Droplet droplet = new Droplet();
    
    private Integer doctorX;
    private Integer doctorY;
    private final Integer stepDoctor = 20;
    
    public GameStatus()
    {
        currentLevel = 1;
        dropletsCollected = 0;
        bagsFilled = 0;
        
        patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
        isStarted = false;
        isFinished = false;
        
        doctorX = 313;
        doctorY = 570;
    }
    
    public void blood_collected()
    {
        if(check_blood())
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
                    droplet.reset();
                    reset();
                }
                else
                {
                    currentLevel++;
                    dropletsCollected = 0;
                    bagsFilled = 0;
                    isStarted = false;
                    droplet.reset();
            
                    patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
                }
            }
        }
        else
            wrong_blood();
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
        doctorX = 313;
        doctorY = 570;
        
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
    
    public Boolean check_blood()
    {
        Boolean result = false;
        
        switch(patientType)
        {
            case O_minus:
                if(droplet.get_bloodType()==BloodType.O_minus)
                    result = true;
                break;
            case O_plus:
                switch(droplet.get_bloodType())
                {
                    case O_minus:
                        result = true;
                        break;
                    case O_plus:
                        result = true;
                        break;
                }
                break;
            case A_minus:
                switch(droplet.get_bloodType())
                {
                    case O_minus:
                        result = true;
                        break;
                    case A_minus:
                        result = true;
                        break;
                }
                break;
            case A_plus:
                switch(droplet.get_bloodType())
                {
                    case O_minus:
                        result = true;
                        break;
                    case O_plus:
                        result = true;
                        break;
                    case A_minus:
                        result = true;
                        break;
                    case A_plus:
                        result = true;
                        break;
                }
                break;
            case B_minus:
                switch(droplet.get_bloodType())
                {
                    case O_minus:
                        result = true;
                        break;
                    case B_minus:
                        result = true;
                        break;
                }
                break;
            case B_plus:
                switch(droplet.get_bloodType())
                {
                    case O_minus:
                        result = true;
                        break;
                    case O_plus:
                        result = true;
                        break;
                    case B_minus:
                        result = true;
                        break;
                    case B_plus:
                        result = true;
                        break;
                }
                break;
            case AB_minus:
                switch(droplet.get_bloodType())
                {
                    case O_minus:
                        result = true;
                        break;
                    case A_minus:
                        result = true;
                        break;
                    case B_minus:
                        result = true;
                        break;
                    case AB_minus:
                        result = true;
                        break;
                }
                break;
            case AB_plus:
                switch(droplet.get_bloodType())
                {
                    case O_minus:
                        result = true;
                        break;
                    case O_plus:
                        result = true;
                        break;
                    case A_minus:
                        result = true;
                        break;
                    case A_plus:
                        result = true;
                        break;
                    case B_minus:
                        result = true;
                        break;
                    case B_plus:
                        result = true;
                        break;
                    case AB_minus:
                        result = true;
                        break;
                    case AB_plus:
                        result = true;
                        break;
                }
                break;
        }
        return result;
    }
    
    public Boolean isStarted()
    {
        return isStarted;
    }
    
    public void set_started()
    {
        isStarted = true;
    }
    
    public Boolean isFinished()
    {
        return isFinished;
    }
    
    public void clear_finished()
    {
        isFinished = false;
    }
    
    public void move_doctor_left()
    {
        if(doctorX > 0)
            doctorX = doctorX - stepDoctor;
    }
    
    public void move_doctor_right()
    {
        if(doctorX < 730)
            doctorX = doctorX + stepDoctor;
    }
    
    public Integer get_doctor_x()
    {
        return doctorX;
    }
    
    public Integer get_doctor_y()
    {
        return doctorY;
    }
}

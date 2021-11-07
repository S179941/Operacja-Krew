package operacjakrew;

import java.awt.*;
import java.util.*;

public class Droplet {
    
    private Integer xPosition;
    private Integer yPosition;
    private BloodType bloodType;
    
    private final Integer incrementY = 10;
    
    public Droplet()
    {
        Random rand = new Random();
        xPosition = (int)rand.nextInt(700);
        yPosition = 0;
        
        bloodType = BloodType.values()[rand.nextInt(BloodType.values().length)];
    }
    
    public Integer get_xPosition()
    {
        return xPosition;
    }
    
    public Integer get_yPosition()
    {
        return yPosition;
    }
    
    public BloodType get_bloodType()
    {
        return bloodType;
    }
    
    public Image get_Image()
    {
        Image dropletImage = Images.get_droplet();
        
        switch(bloodType)
        {
            case O_minus:
                dropletImage = Images.get_droplet_0m();
                break;
            case O_plus:
                dropletImage = Images.get_droplet_0p();
                break;
            case A_minus:
                dropletImage = Images.get_droplet_Am();
                break;
            case A_plus:
                dropletImage = Images.get_droplet_Ap();
                break;
            case B_minus:
                dropletImage = Images.get_droplet_Bm();
                break;
            case B_plus:
                dropletImage = Images.get_droplet_Bp();
                break;
            case AB_minus:
                dropletImage = Images.get_droplet_ABm();
                break;
            case AB_plus:
                dropletImage = Images.get_droplet_ABp();
                break;
        }
        
        return dropletImage;
    }
    
    public void move_down()
    {
        yPosition = yPosition + incrementY;
    }
    
    
}

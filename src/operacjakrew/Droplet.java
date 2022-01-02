/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
All Rights Reserved 2021
*/

package operacjakrew;

import java.awt.*;
import java.util.*;

/**
 * Klasa służąca do opisu pojedynczej kropli krwi
 * @author Michał Ostrowski
 */

public class Droplet {
    /** Pozycja lewego górnego rogu kropli w osi X */
    private Integer xPosition;
    /** Pozycja lewego górnego rogu kropli w osi Y */
    private Integer yPosition;
    /** Grupa krwi (użyto enuma) */
    private BloodType bloodType;
    /** O ile ma się przesuwać kropla co iterację */
    private final Integer incrementY = 3;
    
    /**
     * Konstruktor - przygotowanie kropli do użycia w grze
     */
    public Droplet()
    {
        /** Inicjalizacja funkcji random do losowania grup i pozycji */
        Random rand = new Random();
        /** Losowanie pozycji X */
        xPosition = (int)rand.nextInt(700);
        /** Krople zaczynają ruch od samej góry */
        yPosition = 0;
        /** Losowanie grupy krwi */
        bloodType = BloodType.values()[rand.nextInt(BloodType.values().length)];
    }
    
    /**
     * Pobierz pozycję kropli w osi X
     * @return pozycja w osi X
     */
    public Integer get_xPosition()
    {
        return xPosition;
    }
    
    /**
     * Pobierz pozycję kropli w osi Y
     * @return pozycja w osi Y
     */
    public Integer get_yPosition()
    {
        return yPosition;
    }
    
    /**
     * Pobierz grupę krwi kropli
     * @return grupa krwi
     */
    public BloodType get_bloodType()
    {
        return bloodType;
    }
    
    /**
     * Pobierz odpowiednią ikonę kropli, zależną od grupy
     * @return ikona kropli z grupą
     */
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
    
    /**
     * Wygeneruj na nowo wszystkie parametry kropli
     */
    public void reset()
    {
        Random rand = new Random();
        xPosition = (int)rand.nextInt(700);
        yPosition = 0;
        
        bloodType = BloodType.values()[rand.nextInt(BloodType.values().length)];
    }
    
    /**
     * Przesuwanie kropli w dół pola gry
     */
    public void move_down()
    {
        if(yPosition < 720)
        {
            yPosition = yPosition + incrementY;
        }
        else
            reset();
    }
}

/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
All Rights Reserved 2021
*/

package operacjakrew;

import java.awt.*;

/**
 * Klasa służąca do opisywania stanu gry i jego modyfikowania
 * @author Michał Ostrowski
 */
public class GameStatus {
    /** Numer aktualnego poziomu */
    private Integer currentLevel;
    /** Zebrane krople */
    private Integer dropletsCollected;
    /** Zgromadzone już jednostki krwi */
    private Integer bagsFilled;
    /** Grupa krwi aktualnego pacjenta */
    private BloodType patientType;
    /** Czy gracz uruchomił grę przyciskiem */
    private Boolean isStarted;
    /** Czy gracz osiągnął cel gry */
    private Boolean isFinished;
    /** Utworzenie pojedynczej kropli krwi */
    public Droplet droplet = new Droplet();
    /** Pozycja lekarza w osi X */
    private Integer doctorX;
    /** Pozycja lekarza w osi Y */
    private Integer doctorY;
    /** O ile doktor ma się przesuwać po użyciu przycisku */
    private final Integer stepDoctor = 20;
    
    /**
     * Konstruktor - ustawienie początkowego stanu gry
     */
    public GameStatus()
    {
        /** Zaczyna się od 1 poziomu */
        currentLevel = 1;
        /** Domyślnie brak kropli zebranych */
        dropletsCollected = 0;
        /** Domyślnie brak pojemników wypełnionych */
        bagsFilled = 0;
        /** Losowanie grupy pierwszego pacjenta */
        patientType = BloodType.values()[OperacjaKrew.rand.nextInt(BloodType.values().length)];
        /** Domyślnie gra jest zawieszona */
        isStarted = false;
        /** Domyślnie nie jest skończona */
        isFinished = false;
        /** Doktor domyślnie na środku */
        doctorX = 313;
        /** Doktor przy dolnej krawędzi ekranu */
        doctorY = 570;
    }
    
    /**
     * Funkcja uruchamiana po zebraniu kropli krwi
     */
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
        droplet.reset();
    }
        
    /**
     * Funkcja uruchamiana po zebraniu złej kropli
     */
    public void wrong_blood()
    {
        dropletsCollected = 0;
    }
    
    /**
     * Funkcja resetująca status gry
     */
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
    
    /**
     * Funkcja zwracająca grupę aktualnego pacjenta
     * @return grupa krwi
     */
    public BloodType get_patient_bloodtype()
    {
        return patientType;
    }
    
    /**
     * Funcja zwracająca liczbę wypełnionych pojemników 
     * @return liczba jednostek
     */
    public Integer get_bags_filled()
    {
        return bagsFilled;
    }
    
    /**
     * Funkcja zwracająca ikonę o odpowiednim stopniu wypełnienia
     * @return ikona pakietu
     */
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
    
    /**
     * Funkcja zwracajaca numer poziomu
     * @return numer poziomu
     */
    public Integer get_current_level()
    {
        return currentLevel;
    }
    
    /**
     * Funkcja zwracająca grupę aktualnego pacjenta w formie tekstowej
     * @return String z grupą
     */
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
    
    /**
     * Funkcja porównująca grupę krwi zebranej z oczekiwaną
     * @return czy krew jest odpowiednia
     */
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
    
    /**
     * Funkcja sprawdzajaca, czy gracz zaczął poziom
     * @return stan
     */
    public Boolean isStarted()
    {
        return isStarted;
    }
    
    /**
     * Funkcja ustawiająca stan poziomu na zaczęty
     */
    public void set_started()
    {
        isStarted = true;
    }
    
    /**
     * Funkcja sprawdzajaca, czy gra została ukończona
     * @return stan
     */
    public Boolean isFinished()
    {
        return isFinished;
    }
    
    /**
     * Funkcja resetujaca stan zakończenia gry
     */
    public void clear_finished()
    {
        isFinished = false;
    }
    
    /**
     * Funkcja przesuwająca gracza w lewo
     */
    public void move_doctor_left()
    {
        if(doctorX > 0)
            doctorX = doctorX - stepDoctor;
    }
    
    /**
     * Funkcja przesuwająca gracza w prawo
     */
    public void move_doctor_right()
    {
        if(doctorX < 660)
            doctorX = doctorX + stepDoctor;
    }
    
    /**
     * Funkcja zwracająca pozycję gracza w osi X
     * @return pozycja X
     */
    public Integer get_doctor_x()
    {
        return doctorX;
    }
    
    /**
     * Funkcja zwracająca pozycję gracza w osi Y
     * @return pozycja Y
     */
    public Integer get_doctor_y()
    {
        return doctorY;
    }
}

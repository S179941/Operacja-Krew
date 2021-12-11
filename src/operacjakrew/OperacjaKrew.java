/*Proudly designed and written by Michał Ostrowski
s179941@student.pg.edu.pl
Faculty of Electronics, Telecommunication and IT
Gdańsk University of Technology
All Rights Reserved 2021
*/

package operacjakrew;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

/**
 * Klasa służąca do obsługi zasadniczego okna (JFrame) gry
 * @author Michał Ostrowski
 */

public class OperacjaKrew extends JFrame {
    /** Inicjalizacja funkcji random do losowania grup pacjentów */
    public static Random rand = new Random();
    /** Utworzenie obiektu do przechowywania stanu gry */
    public static GameStatus gameStatus = new GameStatus();
    /** Stworzenie panelu głównego */
    static StartPanel startpanel = new StartPanel();
    /** Stworzenie panelu z instrukcją */
    static HelpPanel helppanel = new HelpPanel();
    /** Stworzenie panelu z akcją gry */
    static GamePanel gamepanel = new GamePanel();
    /** Stworzenie panelu z zakończeniem */
    static EndingPanel endingpanel = new EndingPanel();
    /** Stworzenie panelu z creditsami */
    static CreditsPanel creditspanel = new CreditsPanel();
    /** Stworzenie kolekcji paneli skłądających się na GUI */
    static CardLayout cardlayout = new CardLayout();
    /** Stworzenie pustego panelu w którym umieszczane są pozostałe */
    static JPanel panels = new JPanel();
    
    /**
     * Konstruktor - połączenie wszystkich elementów zgodnie z architekturą gry
     */
    OperacjaKrew() {
        /** Podpięcie zbioru paneli do pustego */ 
        panels.setLayout(cardlayout);
        /** Dodanie panelu głównego do GUI */
        panels.add(startpanel, "START");
        /** Dodanie panelu z instrukcją do GUI */
        panels.add(helppanel, "HELP");
        /** Dodanie panelu z akcją do GUI */
        panels.add(gamepanel, "GRA");
        /** Dodanie panelu z zakończeniem do GUI */
        panels.add(endingpanel, "ENDING");
        /** Dodanie panelu z zakończeniem do GUI */
        panels.add(creditspanel, "CREDITS");
        /** Przesunięcie panelu głównego na wierzch */
        cardlayout.show(panels, "START");
        /** Dodanie zbioru paneli do okna aplikacji */
        add(panels);
        /** Domyślne zamknięcie okna */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /** Ustawienie wymiarów okna */
        setSize(1024,768);
        /** Zablokowanie skalowania okna */
        setResizable(false);
        /** Ustawienie ikonki okna */
        setIconImage(Images.get_droplet());
        /** Ustawienie tytułu okna */
        setTitle("Operacja Krew");
        /** Wyświetlenie okna na ekranie użytkownika */
        setVisible(true);
    }
    
    /**
     * Funkcja startująca grę
     * @param args 
     */
    public static void main(String[] args) {
       new OperacjaKrew();
    }
}

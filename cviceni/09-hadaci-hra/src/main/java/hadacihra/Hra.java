package hadacihra;

import java.util.Random;

public class Hra {

    // Pomocí třídy Random nastavíme hádané číslo na náhodné číslo od 1 do 10.
    // nextInt(10) dává čísla od 0 do 9, proto přičítáme 1
    int hadaneCislo = new Random().nextInt(10) + 1;
    
    // Na začátku hráč ješte neuhodl číslo, musí hádat
    boolean uhodl = false;


    public void start() {
        System.console().format("Hádej číslo od 1 do 10." + "\n");
        
        try {

            // Opakujeme hádání pokud hráč číslo neuhodl
            while (!uhodl) {



                // když hráč uhodne, musíme nastavit uhodl = true aby se hra ukončila
                uhodl = true;
                
                
                
                
            }

        } catch (Exception e) {
            System.out.println("Konec");
        }
    }

}

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

                String line = System.console().readLine("Na jaké číslo myslím? ");
                
                // pokud dostaneme text "exit", ukončíme program vyhozením výjimky
                ukonciKdyzExit(line);
                
                try {
                    int cisloZeVstupu = Integer.parseInt(line);
                    // je číslo správné nebo vétší/menší?
                    zkontrolujCislo(cisloZeVstupu);

                } catch (Exception e) {
                    System.console().format("Toto není číslo, zkus znovu.");
                }
            }

        } catch (Exception e) {
            // Tato výjimka byla vyhozena z metody ukonciKdyzExit po příkazu "exit"
            // Vypíšeme zprávu a aplikace končí
            System.out.println("Konec");
        }
    }

    void zkontrolujCislo(int cisloZeVstupu) {
        // Pokud menší/větší, vypiš to na výsup a pokračuje v hádání
        if (hadaneCislo < cisloZeVstupu) {
            System.console().format("Neuhodl jsi, moje číslo je menší.\n");
        } else if (hadaneCislo > cisloZeVstupu) {
            System.console().format("Neuhodl jsi, moje číslo je větší.\n");
        } else {
            // Pokud ani menší ani větší, je to teda hádané číslo. 
            // Vypiš to a zaznamenej, že hráč uhodl číslo, aby se aplikace ukončila
            System.console().format("Uhodl jsi, moje číslo je skutečně " + cisloZeVstupu + "\n");
            uhodl = true;
        }
    }

    void ukonciKdyzExit(String line) throws Exception {
        if (line.equals("exit")) {
            throw new Exception("Exit");
        }
    }
}

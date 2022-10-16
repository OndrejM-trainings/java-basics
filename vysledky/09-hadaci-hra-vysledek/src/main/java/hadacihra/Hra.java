package hadacihra;

import java.util.Random;
import java.util.Scanner;

public class Hra {

    // Pomocí třídy Random nastavíme hádané číslo na náhodné číslo od 1 do 10.
    // nextInt(10) dává čísla od 0 do 9, proto přičítáme 1
    int hadaneCislo = new Random().nextInt(10) + 1;
    
    // Na začátku hráč ješte neuhodl číslo, musí hádat
    boolean uhodl = false;

    public void start() {

        System.out.println("Hádej číslo od 1 do 10.");
        
        try {

            // Opakujeme hádání pokud hráč číslo neuhodl
            while (!uhodl) {

                String line = nactiRadek("Na jaké číslo myslím? ");
                
                // pokud dostaneme text "konec", ukončíme program vyhozením výjimky
                ukonciKdyzExit(line);
                
                try {
                    int cisloZeVstupu = Integer.parseInt(line);
                    // vytvoříme objekt Pokus pro hádací pokus hráče
                    Pokus pokus = new Pokus(this.hadaneCislo);
                    pokus.cisloOdHrace = cisloZeVstupu;
                    // je číslo správné nebo vétší/menší?
                    uhodl = pokus.zkontrolujCislo();

                } catch (Exception e) {
                    System.out.println("Toto není číslo, zkus znovu.");
                }
            }

        } catch (Exception e) {
            // Tato výjimka byla vyhozena z metody ukonciKdyzExit po příkazu "exit"
            // Vypíšeme zprávu a aplikace končí
            System.out.println("Konec");
        }
    }

    void ukonciKdyzExit(String line) throws Exception {
        if (line.equals("konec")) {
            throw new Exception("Konec");
        }
    }

    private String nactiRadek(String popisVstupu) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(popisVstupu);
        return scanner.nextLine();
    }
}

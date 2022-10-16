package hadacihra;

public class Pokus {
    int cisloOdHrace;
    int hadaneCislo;
    
    Pokus(int hadaneCislo) {
        this.hadaneCislo = hadaneCislo;
    }

    boolean zkontrolujCislo() {
        // Pokud menší/větší, vypiš to na výsup a pokračuje v hádání
        if (hadaneCislo < cisloOdHrace) {
            System.out.println("Neuhodl jsi, moje číslo je menší.");
            return false;
        } else if (hadaneCislo > cisloOdHrace) {
            System.out.println("Neuhodl jsi, moje číslo je větší.");
            return false;
        } else {
            // Pokud ani menší ani větší, je to teda hádané číslo. 
            // Vypiš to a zaznamenej, že hráč uhodl číslo, aby se aplikace ukončila
            System.out.println("Uhodl jsi, moje číslo je skutečně " + cisloOdHrace);
            return true;
        }
    }
}

package letadla;

public class Letiste {
    Letadlo[] letadla = new Letadlo[10];
    int pocetLetadel = 0;
    String nazev;
    
    Letiste(String nazevLetiste) {
        nazev = nazevLetiste;
    }

    void pridejLetadlo(Letadlo letadlo) {
        letadla[pocetLetadel] = letadlo;
        pocetLetadel = pocetLetadel + 1; // nebo jenom pocetLetadel++
    }
    
    void odeberLetadlo(Letadlo letadlo) {
        int i = 0;
        boolean mameLetadlo = false;
        int poziceLetadla = 0;
        
        while ( !mameLetadlo && i < pocetLetadel) {
            if (letadlo == letadla[i]) {
                mameLetadlo = true;
                poziceLetadla = i;
            } else {
                i++;
            }
        }
        
        if (mameLetadlo) {
            letadla[poziceLetadla] = letadla[pocetLetadel-1];
            letadla[pocetLetadel] = null;
            pocetLetadel = pocetLetadel - 1;
        }
    }
    
    void vypisLetadlaNaLetisti() {
        System.out.println("Na letišti " + nazev + " jsou tyto letadla (počet:" + pocetLetadel + ") :");
        int i = 0;
        while (i < pocetLetadel) {
            System.out.println(letadla[i].nazev);
            i++;
        }
    }
}

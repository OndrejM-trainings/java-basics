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
}

package letadla;

public class Letadlo {
    Letiste letiste;
    String nazev;
    
    Letadlo(String nazevLetadla, Letiste letiste) {
        nazev = nazevLetadla;
        this.letiste = letiste;
        this.letiste.pridejLetadlo(this);
    }
    
    void odletDo(Letiste letiste) {
        this.letiste.odeberLetadlo(this);
        this.letiste = letiste;
        this.letiste.pridejLetadlo(this);
    }
    
}

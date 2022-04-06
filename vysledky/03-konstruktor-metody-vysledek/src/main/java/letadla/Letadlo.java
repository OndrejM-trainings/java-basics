package letadla;

public class Letadlo {
    Letiste letiste;
    
    Letadlo(Letiste vychoziLetiste) {
        letiste = vychoziLetiste;
        letiste.pridejLetadlo(this);
    }
    
}

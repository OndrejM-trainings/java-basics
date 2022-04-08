package obchod;

import placeni.PlatebniTerminal;
import placeni.Pokladna;

public class Aplikace {
    public static void main(String[] args) {
        Pokladna nejakaPokladna = new Pokladna();
        PlatebniTerminal terminalPokladny = new PlatebniTerminal();
        
        nejakaPokladna.terminal = terminalPokladny;
        
    }
}

class Vypocty {
    static int mocnina(int cislo) {
        return cislo * cislo;
    }
}
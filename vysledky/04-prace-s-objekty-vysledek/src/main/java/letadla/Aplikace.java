package letadla;

public class Aplikace {
    public static void main(String[] args) {
        Letiste letistePraha = new Letiste("Praha");
        Letiste letisteLondyn = new Letiste("Londýn");
        Letiste[] vsechnaLetiste = new Letiste[] {letistePraha, letisteLondyn};

        Letadlo letadlo1 = new Letadlo("Letadlo z Prahy", letistePraha);
        Letadlo letadlo2 = new Letadlo("Letadlo z Londýna", letisteLondyn);
        letadlo1.odletDo(letisteLondyn);
        letadlo2.odletDo(letistePraha);
        
        
        for (Letiste l : vsechnaLetiste) {
            l.vypisLetadlaNaLetisti();
        }
    }
}

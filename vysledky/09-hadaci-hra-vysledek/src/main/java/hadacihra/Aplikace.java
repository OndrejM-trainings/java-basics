package hadacihra;

public class Aplikace {

    /* Toto je vstupní místo naší aplikace
       Budeme pracovat s objektem typu Hra, aby jsme mohli pracovat s promennými objektu a metodami tak, jak jsme zvyklí.
       Proto vstupní metoda main jenom vytvoří nový objekt typu Hra a na objektu spustí metodu start, která začne naši hru.
       Všechno ostatní bude zapsáno v class Hra.
    */
    
    public static void main(String[] args) {

        Hra hra = new Hra();
        hra.start();

    }
}

package vyjimky;

public class Aplikace {
    public static void main(String[] args) {
        
        vyhodVyjimku();

        System.out.println("Počítám číslo.");
        int cislo = 1 / 0;
        
        System.out.println("Volám metodu bez objektu");
        String text = null;
        text.length();
        
        System.out.println("Používám nesprávný index pole");
        int[] cisla = new int[10];
        cisla[100] = 100;
        
        System.out.println("Chci zápornou velikost pole"); 
        int velikost = -1;
        String[] jmena = new String[velikost];
        
        
        
        
    }
    
    public static void vyhodVyjimku() throws Exception {
        new Exception("Chceme výjimku");
    }
}

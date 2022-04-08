package vyjimky;

public class Aplikace {

    public static void main(String[] args) {

        try {
            vyhodVyjimku();
        } catch (Exception e) {
            System.out.println("Výjimka: " + e.getMessage());
        }

        try {
            System.out.println("Počítám číslo.");
            int cislo = 1 / 0;
        } catch (Exception e) {
            System.out.println("Výjimka: " + e.getMessage());
        }

        try {
            System.out.println("Volám metodu bez objektu");
            String text = null;
            text.length();
        } catch (Exception e) {
            System.out.println("Výjimka: " + e.getMessage());
        }

        try {
            System.out.println("Používám nesprávný index pole");
            int[] cisla = new int[10];
            cisla[100] = 100;
        } catch (Exception e) {
            System.out.println("Výjimka: " + e.getMessage());
        }

        try {
            System.out.println("Chci zápornou velikost pole");
            int velikost = -1;
            String[] jmena = new String[velikost];
        } catch (Exception e) {
            System.out.println("Výjimka: " + e.getMessage());

        }

    }

    public static void vyhodVyjimku() throws Exception {
        new Exception("Chceme výjimku");
    }
}

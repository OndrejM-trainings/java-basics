package konzole;

import java.util.Scanner;

public class Aplikace {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napiš text: ");
        String line = scanner.nextLine();
        System.out.println("Přečteno: " + line);

        // Pod tento řádek napište další příkazy

        System.out.println("Napiš číslo: ");
        line = scanner.nextLine();
        int cislo = Integer.parseInt(line);
        System.out.println("Přečteno číslo: " + cislo);

        System.out.println("Napiš číslo: ");
        cislo = scanner.nextInt();
        System.out.println("Přečteno číslo: " + cislo);
        
    }
}

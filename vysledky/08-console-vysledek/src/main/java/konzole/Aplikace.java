package konzole;

public class Aplikace {

    public static void main(String[] args) {
        
        String line = System.console().readLine("Napiš text: ");
        System.console().format("Přečteno: " + line + "\n");

        line = System.console().readLine("Napiš číslo: ");
        int cislo = Integer.parseInt(line);
        System.console().format("Přečteno číslo: " + cislo + "\n");
        
        line = System.console().readLine("Napiš větu: ");
        String[] slova = line.split(" ");
        System.console().format("Slov ve větě: " + slova.length + "\n");
        
    }
}

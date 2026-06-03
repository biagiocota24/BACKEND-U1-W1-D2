import java.util.Scanner;

public class Metodi {
    public static boolean pariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        return ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0);
    }

    public static void numeroInLettere(int numero) {
        if (numero < 0) {
            System.out.println("valore negativo non consenito");
            return;
        }
        switch (numero) {
            case 1 -> System.out.println("uno");
            case 2 -> System.out.println("due");
            case 3 -> System.out.println("tre");
            default -> System.out.println("valore maggiore di tre");
        }
    }

    static Scanner scanner = new Scanner(System.in);


    public static void separaLettere() {
        while (true) {
            System.out.println("inserisci una stringa");
            String stringa = scanner.nextLine();
            if (stringa.equals(":q")) {
                System.out.println("hai digitato la stringa proibita!");
                break;
            }
            String newString = "";
            for (int i = 0; i < stringa.length(); i++) {
                newString += i == stringa.length() - 1 ? stringa.charAt(i) : stringa.charAt(i) + ",";
            }
            System.out.println(newString);
        }
    }

    public static void lancioMissile() {
        System.out.println("inserisci i secondi per il lancio");
        int secondiLancio = scanner.nextInt();

        if (secondiLancio < 0) {
            secondiLancio = Math.abs(secondiLancio);
        }
        if (secondiLancio > 20) {
            secondiLancio = 20;
        }
        System.out.println("Secondi di lancio " + secondiLancio);

        for (int i = secondiLancio; i >= 0; i--) {
            if (i == 0) {
                System.out.println("avvio lancio");
            } else if (i % 2 == 0) {
                System.out.println("[OK] " + i);
            } else {
                System.out.println("[CHECK] " + i);
            }
            if (i == secondiLancio / 2) {
                System.out.println("----- SEPARAZIONE STATO ----------");
            }
        }
    }


}




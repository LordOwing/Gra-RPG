import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elden Ring");
        System.out.printf("Witaj w grze która niszczy ludzi i doprowadza ich do załamania i depresji! Miłej zabawy :3");

        Character c1 = new Character("Diggler", 1, 200, 10, 10, 10);

        System.out.println("\n Wybierz klase postaci: \n 1.Astrologer\n 2.Bandit \n 3.Samurai \n 4.Warrior");

        int chosen = scanner.nextInt();

//        System.out.println("wybrałeś: "+chosen);

        if (chosen == 1) {
            System.out.println("Wybrałeś klase Astrologer");
        }
        else if (chosen == 2) {
            System.out.println("Wybrałeś klase Bandit");
        }
        else if (chosen == 3) {
            System.out.println("Wybrałeś klase Samurai");
        }
        else if (chosen == 4) {
            System.out.println("Wybrałeś klase Warrior");
        }
        else {
            throw new ArithmeticException("Błąd! Wybierz klase od 1 do 4");
        }



    }
}
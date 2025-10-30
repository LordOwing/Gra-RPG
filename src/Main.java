import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defeatedChampions =0;

        System.out.println("Elden Ring");
        System.out.printf("Witaj w grze która niszczy ludzi i doprowadza ich do załamania i depresji! Miłej zabawy :3 \n");

        System.out.println("Wpisz swój nick: \n");

        String name = scanner.nextLine();




//        System.out.print("nick: " + c1.name + "\nlevel: " + c1.level + "\nzdrowie: " + c1.health + "\nsiła: " + c1.strength + "\nzwinność: " + c1.dexterity + "\ninteligenca: " + c1.intelligence + "\n");

        System.out.println("\nWybierz klase postaci: \n1.Astrologer\n2.Bandit \n3.Samurai \n4.Warrior");

        int chosen = scanner.nextInt();

//        System.out.println("wybrałeś: "+chosen);
        Character player = null;


        if (chosen == 1) {
            System.out.println("Wybrałeś klase Astrologer");
            player = new Astrologer(name, 1000, 10, 10, 10, 100);
            System.out.print("nick: " + player.name  + "\nzdrowie: " + player.health + "\nsiła: " + player.strength + "\nzwinność: " + player.dexterity + "\ninteligencja: " + player.intelligence + "\n");
        }
        else if (chosen == 2) {
            System.out.println("Wybrałeś klase Bandit");
            player = new Bandit(name, 1000, 10, 10, 10, 100);

        }
        else if (chosen == 3) {
            System.out.println("Wybrałeś klase Samurai");
            player = new Samurai(name, 1000, 10, 10, 10, 100);

        }
        else if (chosen == 4) {
            System.out.println("Wybrałeś klase Warrior");
            player = new Samurai(name, 1000, 10, 10, 10, 100);

        }
        else {
            throw new ArithmeticException("Błąd! Wybierz klase od 1 do 4");
        }
        System.out.println(player.toString());
        boolean flag = true;
        boolean defeated = false;
        String answer;
        while (flag == true && defeated == false) {
            if(BattleManager.battle(player)){
                defeatedChampions++;
                System.out.println("Gratuluję, wygrałeś walkę! Czy chcesz kontynuować? Odpowiedz tak lub nie: ");
                answer = scanner.next();
                if (!answer.equalsIgnoreCase("tak")) {flag = false;}
                continue;
            }
            defeated = true;
            System.out.println("Przykro mi ale poległeś. ");
        }
        System.out.println("Koniec gry," + name +  " pokonałeś:  " + defeatedChampions + " wrogów");

    }





}
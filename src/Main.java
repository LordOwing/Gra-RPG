import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int champ;

        System.out.println("Elden Ring");
        System.out.printf("Witaj w grze która niszczy ludzi i doprowadza ich do załamania i depresji! Miłej zabawy :3 \n");

        System.out.println("Wpisz swój nick: \n");

        String name = scanner.nextLine();

        Enemy e1 = new Enemy(6080);


//        System.out.print("nick: " + c1.name + "\nlevel: " + c1.level + "\nzdrowie: " + c1.health + "\nsiła: " + c1.strength + "\nzwinność: " + c1.dexterity + "\ninteligenca: " + c1.intelligence + "\n");

        System.out.println("\nWybierz klase postaci: \n1.Astrologer\n2.Bandit \n3.Samurai \n4.Warrior");

        int chosen = scanner.nextInt();

//        System.out.println("wybrałeś: "+chosen);
        Character player = null;

        if (chosen == 1) {
            System.out.println("Wybrałeś klase Astrologer");
            player = new Astrologer(name, 1, 1000, 10, 10, 10, 100);
            System.out.print("nick: " + player.name + "\nlevel: " + player.level + "\nzdrowie: " + player.health + "\nsiła: " + player.strength + "\nzwinność: " + player.dexterity + "\ninteligenca: " + player.intelligence + "\n");
        }
        else if (chosen == 2) {
            System.out.println("Wybrałeś klase Bandit");
            player = new Bandit(name, 1, 1000, 10, 10, 10, 100);

        }
        else if (chosen == 3) {
            System.out.println("Wybrałeś klase Samurai");
            player = new Samurai(name, 1, 1000, 10, 10, 10, 100);

        }
        else if (chosen == 4) {
            System.out.println("Wybrałeś klase Warrior");
            player = new Samurai(name, 1, 1000, 10, 10, 10, 100);

        }
        else {
            throw new ArithmeticException("Błąd! Wybierz klase od 1 do 4");
        }

        System.out.println("Napotkałeś pierwszego bossa Godrick the Grafted");

        while (player.health > 0 || e1.health > 0) {
            Random r= new Random();
            int hp_player = player.health;
            int hp_enemy = e1.health;


            System.out.println("Co chcesz zrobić: \n1.Normalny atak \n2. Mocny atak \n3. Health potion (pozostło 2) \n4. Ult \n");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    int r1 = r.nextInt(101);
                    hp_enemy -= r1;
                    System.out.println(hp_enemy);
                case 2:
                    int r2 = r.nextInt(501);
                case 3:

                case 4:
                    int r3 = r.nextInt(1001);
            }

        }


        //ITEMY//

        Sword sword = new Sword("Miecz Bohatera", 100, 25, 5, 3.5, 150, 0.9);
        Shield shield = new Shield("Tarcza Strażnika", 150, 5, 30, 6.0, 120, 0.75);
        Armor armor = new Armor("Zbroja Rycerska", 200, 0, 50, 15.0, 300, "ciężka");
        Bow bow = new Bow("Łuk Elfa", 80, 20, 0, 2.0, 200, 60);

        Equipment eq1 = new Equipment();

        eq1.addItem(sword, 0);
        eq1.addItem(shield, 1);
        eq1.addItem(armor, 2);
        eq1.addItem(bow, 3);

        eq1.displayEq();

        eq1.chooseSlot(0);
        UseItem.uzyj(eq1);

        eq1.chooseSlot(1);
        UseItem.uzyj(eq1);

        eq1.chooseSlot(2);
        UseItem.uzyj(eq1);

        eq1.chooseSlot(3);
        UseItem.uzyj(eq1);



    }
}
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

        Itemy[] Eq = new Itemy[5];

        Eq[0] = new HealingPotion("Mikstura Leczenia", "do picia", 3);
        Eq[1] = new StrenghtPotion("Mikstura Siły", "do picia", 2);
        Eq[2] = new PoisonPotion("Mikstura Zatrucia", "do rzucania", 1);
        Eq[3] = new StrenghtAmulet("Amulet Mocy");
        Eq[4] = new HealthAmulet("Amulet Życia");

        choosen(Eq, 0, player, e1);
        choosen(Eq, 0, player, e1);
        choosen(Eq, 1, player, e1);
        choosen(Eq, 1, player, e1);
        choosen(Eq, 2, player, e1);
        choosen(Eq, 3, player, e1);
        choosen(Eq, 4, player, e1);

    }

    public static void choosen(Itemy[] ekwipunek, int slot, Character player, Enemy enemy) {
        System.out.println("\nWybrano slot " + slot + ":");

        if (slot < 0 || slot >= ekwipunek.length) {
            System.out.println("Niepoprawny numer slotu.");
            return;
        }

        Itemy item = ekwipunek[slot];

        if (item == null) {
            System.out.println("Ten slot jest pusty.");
            return;
        }

        item.use(player, enemy);

        if (item.getUses() <= 0) {
            ekwipunek[slot] = null;
            System.out.println("Slot " + slot + " został opróżniony.");
        }
    }

}


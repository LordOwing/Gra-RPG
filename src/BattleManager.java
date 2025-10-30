import java.util.Random;
import java.util.Scanner;

public class BattleManager {
    public static void chooseEnemyAttack(Character enemy,Character target) {
        int randomNum = (int)(Math.random() * 3)+1;
        switch (randomNum){
            case 1:
                enemy.normalAttack(target);
                break;

            case 2:
                if(!enemy.superAttack(target)){chooseEnemyAttack(enemy,target);}
                break;
            case 3:
                if(!enemy.Ult(target)){chooseEnemyAttack(enemy,target);}
                break;
        }
    }
    public static boolean battle(Character player){
        player.energy = 100;
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 4)+1;
        int randomHealth = (int)(Math.random() * 3000)+1;
        int randomStrength = (int)(Math.random() * 100)+1;
        int randomDexterity = (int)(Math.random() * 50)+1;
        int randomInteligence = (int)(Math.random() * 50)+1;
        int randomEnergy = (int)(Math.random() * 101)+100;
        Character enemy = null;
        switch(randomNum){

            case 1:

                enemy = new Bandit("Bandyta", randomHealth, randomStrength, randomDexterity, randomInteligence, randomEnergy);
                break;
            case 2:

                enemy = new Samurai("Samurai", randomHealth, randomStrength, randomDexterity, randomInteligence, randomEnergy);
                break;
            case 3:

                enemy = new Astrologer("Astrologer", randomHealth, randomStrength, randomDexterity, randomInteligence, randomEnergy);
                break;
            case 4:

                enemy = new Warrior("Wojownik", randomHealth, randomStrength, randomDexterity, randomInteligence, randomEnergy);
                break;
        }

        System.out.println("Napotkałeś bossa: " + enemy.name);


        Item[] Eq = new Item[5];
        Item newItem = null;
        randomNum = (int)(Math.random() * 5)+1;
        int randomUses = (int)(Math.random() * 4)+1;
        switch(randomNum){

            case 1:
                newItem = new HealingPotion("Potka - Leczenie", randomUses);


                break;
            case 2:
                newItem = new HealthAmulet("Amulet - Leczenie");

                break;
            case 3:
                newItem = new StrenghtAmulet("Amulet - Siła");

                break;
            case 4:
                newItem = new StrenghtPotion("Potka - Siła", randomUses);

                break;
            case 5:
                newItem = new PoisonPotion("Potka - Trucizna", randomUses);

                break;
        }
        for(int i = 0; i < Eq.length; i++){
            if(Eq[i] == null){
                Eq[i] = newItem;
                newItem.items = Eq;
                newItem.index = i;
                System.out.println("Wylosowałeś nowy item: " + newItem.name + ". Masz : " + newItem.uses + " użyć");
                break;
            }
        }
        Comperable compare = new Comperable();
        compare.compare(player, enemy);
        while (player.health > 0 && enemy.health > 0) {


            int action = 0;
            int eqChoice =  0;
            if(player.energy <= 95){
                player.energy += 5;
            }


            System.out.println("Co chcesz zrobić: \n1.Normalny atak \n2. Mocny atak \n3. Użycie itemu \n4. Ult \n5. Otwórz ekwipunek \n");
            try {
                action = scanner.nextInt();


                switch (action) {
                    case 1:

                        player.normalAttack(enemy);
                        if(enemy.health>0){
                            chooseEnemyAttack(enemy,player);
                        }
                        break;
                    case 2:
                        if(player.superAttack(enemy) && enemy.health>0){chooseEnemyAttack(enemy,player);};
                    case 3:
                        System.out.println("Podaj numer slotu: ");
                        eqChoice = scanner.nextInt();
                        if(Eq[eqChoice-1] != null){
                            Eq[eqChoice-1].use(player, enemy);
                            chooseEnemyAttack(enemy, player);
                        }else{
                            System.out.println("Podałeś nieprawidłową wartość");
                        }
                        break;
                    case 4:
                        if(player.Ult(enemy) && enemy.health>0){chooseEnemyAttack(enemy,player);};
                        break;
                    case 5:
                        System.out.println("Ekwipunek: ");
                        for(int i = 0; i < Eq.length; i++){
                            if(Eq[i] != null){
                                System.out.println(i+1 + " : " + Eq[i].name + ". Pozostałych użyć: " + Eq[i].uses);
                            }
                            System.out.println(i+1 + " : Puste");
                        }


                }
            }catch (java.util.InputMismatchException e) {
                System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                action = 0;
                scanner.nextLine();
            }
        }
        return((player.health>0) ? true :  false);


    }
}

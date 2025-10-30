import java.util.Random;

public class Bandit extends Character{


    public Bandit(String name, int health, int strength, int dexterity, int intelligence, int energy) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.energy = energy;
    }

    @Override
    public void normalAttack(Character enemy) {
        Random r = new Random();
        int dmg = r.nextInt(101) + (3*dexterity) + strength + intelligence;
        enemy.health -= dmg;
        System.out.println(name + " używa normalnego ataku i zadaje " + dmg + " obrażeń! (HP wroga: " + enemy.health + ") \n pozostałą energia " + this.energy);
    }

    @Override
    public boolean superAttack(Character enemy) {
        if(this.energy >= 10){
            Random r = new Random();
            int dmg = r.nextInt(501) + (3*dexterity) + strength + intelligence;
            enemy.health -= dmg;
            this.energy -= 10;
            System.out.println(name + " używa super ataku i zadaje " + dmg + " obrażeń! (HP wroga: " + enemy.health + ") \n pozostałą energia " + this.energy);
            return true;
        }
        else{
            System.out.println("Nie masz wystarczająco energii, by użyć super ataku");
            return false;
        }
    }

    @Override
    public boolean Ult(Character enemy){
        if(this.energy >= 20){
            Random r = new Random();
            int dmg = r.nextInt(1001) + (3*dexterity) + strength + intelligence;
            enemy.health -= dmg;
            this.energy -= 20;
            System.out.println(name + " używa ulta i zadaje " + dmg + " obrażeń (HP wroga: " + enemy.health + ") \n pozostałą energia " + this.energy);
            return true;
        }

        else{
            System.out.println("Nie masz wystarczająco energii, by użyć ulta");
            return false;
        }
    }

}
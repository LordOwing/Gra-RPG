import javax.accessibility.AccessibleTable;
import java.io.Serializable;
import java.util.Random;

public class Astrologer extends Character{


    public Astrologer(String name, int level, int health, int strength, int dexterity, int intelligence, int energy) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.energy = energy;
    }

    @Override
    public void normalAttack(Enemy enemy) {
        Random r = new Random();
        int dmg = r.nextInt(101) + (2*intelligence) + strength + dexterity;
        enemy.health -= dmg;
        System.out.println(name + " używa normalnego ataku i zadaje " + dmg + " obrażeń! (HP wroga: " + enemy.health + ") \n pozostałą energia " + this.energy);
    }

    @Override
    public boolean superAttack(Enemy enemy) {
        if(this.energy >= 10){
            Random r = new Random();
            int dmg = r.nextInt(501) + (2*intelligence) + strength + dexterity;
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
    public boolean Ult(Enemy enemy){
        if(this.energy >= 20){
            Random r = new Random();
            int dmg = r.nextInt(1001) + (2*intelligence) + strength + dexterity;
            enemy.health -= dmg;
            this.energy -= 20;
            System.out.println(name + " używa ulta i zadaje " + dmg + " obrażeń (HP wroga: " + enemy.health + ") \n pozostałą energia " + this.energy);
            return  true;
        }
        else{
            System.out.println("Nie masz wystarczająco energii, by użyć ulta");
            return false;
        }
    }

}
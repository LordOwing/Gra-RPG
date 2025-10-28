import javax.accessibility.AccessibleTable;
import java.io.Serializable;
import java.util.Random;

public class Astrologer extends Character implements Attackable {
    int energy;

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
        int dmg = r.nextInt(101) + intelligence;
        enemy.health -= dmg;
        System.out.println(name + " używa normalnego ataku i zadaje " + dmg + " obrażeń! (HP wroga: " + enemy.health + ")");
    }

    @Override
    public void superAttack(Enemy enemy) {
        Random r = new Random();
        int dmg = r.nextInt(501) + intelligence;
        enemy.health -= dmg;
        System.out.println(name + " używa super ataku i zadaje " + dmg + " obrażeń! (HP wroga: " + enemy.health + ")");
    }

    @Override
    public void Ult(Enemy enemy){
        Random r = new Random();
        int dmg = r.nextInt(1001) + intelligence;
        enemy.health -= dmg;
        System.out.println(name + " używa ulta i zadaje " + dmg + " obrażeń (HP wroga: " + enemy.health + ")");
    }

}

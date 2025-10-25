import java.io.Serializable;

public class Character implements Attackable {
    String name;
    int level;
    int health;
    int strength;
    int dexterity;
    int intelligence;


//    public Character(String name, int level, int health, int strength, int dexterity, int intelligence) {
//        this.name = name;
//        this.level = level;
//        this.health = health;
//        this.strength = strength;
//        this.dexterity = dexterity;
//        this.intelligence = intelligence;
//    }

    @Override
    public void attack() {

    }
}

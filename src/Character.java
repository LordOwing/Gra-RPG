public class Character{
    String name;
    int health;
    int strength;
    int dexterity;
    int intelligence;
    int energy;


//    public Character(String name, int level, int health, int strength, int dexterity, int intelligence) {
//        this.name = name;
//        this.level = level;
//        this.health = health;
//        this.strength = strength;
//        this.dexterity = dexterity;
//        this.intelligence = intelligence;
//    }


    public void normalAttack(Character character) {

    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", energy=" + energy +
                '}';
    }

    public boolean superAttack(Character enemy) {
        return  false;
    }

    public boolean Ult(Character enemy){
        return false;
    }

}
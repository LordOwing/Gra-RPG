public class Armor extends ItemDefault {

    private String armorType;

    public Armor(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, String armorType) {
        super(  name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.armorType = armorType;
    }


    @Override
    public void use() {
        if (durability > 0) {
            System.out.println("Zakładasz zbroję typu " + armorType + ".");
        } else {
            System.out.println(name + " jest zniszczona i nie nadaje się do noszenia!");
        }
    }
}

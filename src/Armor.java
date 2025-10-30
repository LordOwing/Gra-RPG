public class Armor extends ItemDefault {
    private String armorType;

    public Armor(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, String armorType) {
        super(
                name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.armorType = armorType;
    }

    public void equip() {
        System.out.println("Założono zbroję typu: " + armorType);
    }
}

public class Armor extends Item {
    private String armorType;

    public Armor(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, String rarity, String armorType) {
        super(
                name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value,
                rarity
        );
        this.armorType = armorType;
    }

    public void equip() {
        System.out.println("Założono zbroję typu: " + armorType);
    }
}

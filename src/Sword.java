public class Sword extends Item {
    private double sharpness;

    public Sword(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, String rarity, double sharpness) {
        super(
                name,
                durability,
                attackDamage,
                defenseDamage,
                weight, value,
                rarity
        );
        this.sharpness = sharpness;
    }

    public void slash() {
        System.out.println(name + " wykonuje potężne cięcie!");
        use();
    }
}

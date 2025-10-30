public class Sword extends ItemDefault {
    private double sharpness;

    public Sword(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, double sharpness) {
        super(name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.sharpness = sharpness;
    }

    public void slash() {
        System.out.println(name + " wykonuje potężne cięcie!");
        use();
    }
}
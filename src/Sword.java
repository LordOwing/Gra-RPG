public class Sword extends ItemDefault {

    private double sharpness;

    public Sword(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, double sharpness) {
        super(  name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.sharpness = sharpness;
    }


    @Override
    public void use() {
        if (durability > 0) {
            durability--;
            System.out.println(name + " wykonuje potężne cięcie!");
        } else {
            System.out.println(name + " jest zniszczony i nie może ciąć!");
        }
    }
}

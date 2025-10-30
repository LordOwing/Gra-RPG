public class Bow extends ItemDefault {

    private int range;

    public Bow(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, int range) {
        super(  name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.range = range;
    }


    @Override
    public void use() {
        if (durability > 0) {
            durability--;
            System.out.println(name + " wypuszcza strzałę na dystans " + range + " metrów!");
        } else {
            System.out.println(name + " jest zniszczony i nie może strzelać!");
        }
    }
}

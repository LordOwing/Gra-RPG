public class Bow extends ItemDefault {
    private int range;

    public Bow(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, int range) {
        super(
                name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.range = range;
    }

    public void shoot() {
        System.out.println(name + " wypuszcza strzałę na dystans " + range + " metrów!");
        use();
    }
}
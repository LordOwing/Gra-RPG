public class Bow extends Item {
    private int range;

    public Bow(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, String rarity, int range) {
        super(
                name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value,
                rarity
        );
        this.range = range;
    }


    public void shoot() {
        System.out.println(name + " wypuszcza strzałę na dystans " + range + " metrów!");
        use();
    }

}

public class Shield extends ItemDefault {
    private double blockChance;

    public Shield(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, double blockChance) {
        super(
                name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.blockChance = blockChance;
    }

    public void block() {
        System.out.println(name + " próbuje zablokować atak!");
        use();
    }
}

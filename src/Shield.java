public class Shield extends Item {
    private double blockChance;

    public Shield(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, String rarity, double blockChance) {
        super(
                name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value,
                rarity
        );
        this.blockChance = blockChance;
    }

    public void block() {
        System.out.println(name + " próbuje zablokować atak!");
        use();
    }

}

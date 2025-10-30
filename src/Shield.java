public class Shield extends ItemDefault {

    private double blockChance;

    public Shield(String name, int durability, int attackDamage, int defenseDamage, double weight, int value, double blockChance) {
        super(  name,
                durability,
                attackDamage,
                defenseDamage,
                weight,
                value
        );
        this.blockChance = blockChance;
    }


    @Override
    public void use() {
        if (durability > 0) {
            durability--;
            System.out.println(name + " blokuje atak z szansą " + (blockChance * 100) + "%!");
        } else {
            System.out.println(name + " jest zniszczona i nie może blokować!");
        }
    }
}

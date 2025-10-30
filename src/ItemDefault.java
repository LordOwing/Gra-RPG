public class ItemDefault {
    protected String name;
    protected int durability;
    protected int attackDamage;
    protected int defenseDamage;
    protected double weight;
    protected int value;
    protected String rarity = "Rare";

    public ItemDefault(String name, int durability, int attackDamage, int defenseDamage, double weight, int value) {
        this.name = name;
        this.durability = durability;
        this.attackDamage = attackDamage;
        this.defenseDamage = defenseDamage;
        this.weight = weight;
        this.value = value;
    }

    public void use() {
        if (durability > 0) {
            durability--;
            System.out.println(name + " został użyty.");
        } else {
            System.out.println(name + " jest zniszczony!");
        }
    }

    public void displayInfo() {
        System.out.println("=== " + name + " ===");
        System.out.println("Rzadkość: " + rarity);
        System.out.println("Trwałość: " + durability);
        System.out.println("Atak: " + attackDamage);
        System.out.println("Obrona: " + defenseDamage);
        System.out.println("Waga: " + weight);
        System.out.println("Wartość: " + value + " złota");
    }
}

public class Itemy {
    protected String name;
    protected String type;
    protected int uses;

    public Itemy(String name, String type, int uses) {
        this.name = name;
        this.type = type;

        if (type.equalsIgnoreCase("do rzucania")) {
            this.uses = 1;
        } else {
            this.uses = uses;
        }
    }

    public void use(Character player, Enemy enemy) {
        System.out.println(name + " została użyta.");
        uses--;
        if (uses <= 0) {
            destroy();
        }
    }

    public void destroy() {
        System.out.println(name + " została zużyta.");
    }

    public void displayInfo() {
        System.out.println("=== " + name + " ===");
        System.out.println("Typ mikstury: " + type);
        System.out.println("Pozostałe użycia: " + uses);
    }

    public int getUses() {
        return uses;
    }
}

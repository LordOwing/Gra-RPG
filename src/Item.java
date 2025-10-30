import javax.management.StringValueExp;
import javax.print.DocFlavor;
import java.util.Arrays;

public class Item{
    protected String name;

    protected int uses;
    protected Item [] items;
    protected int index;
    public Item(String name, int uses) {
        this.name = name;
        this.uses = uses;


    }
    public void assignArray(Item [] items, int index) {
        this.items = items;
        this.index = index;
    }
    public void use(Character player, Character enemy) {
        System.out.println(name + " została użyta.");
        uses--;
        if (uses <= 0) {
            destroy();
        }
    }

    public void destroy() {
        System.out.println(name + " została zużyta.");
        this.items[this.index] = null;
    }

    public void displayInfo() {
        System.out.println("=== " + name + " ===");
        System.out.println("Pozostałe użycia: " + uses);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", uses=" + uses +
                ", items=" + Arrays.toString(items) +
                ", index=" + index +
                '}';
    }

    public int getUses() {
        return uses;
    }



}

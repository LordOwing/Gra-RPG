public class UseItem {

    public static void uzyj(Equipment ekwipunek) {
        ItemDefault item = ekwipunek.returnSelectedItem();

        if (item == null) {
            System.out.println("Nie ma żadnego przedmiotu w wybranym slocie!");
            return;
        }

        System.out.println("\nUżywasz przedmiotu: " + item.name);
        item.use();
        System.out.println("Pozostała trwałość: " + item.durability);
    }
}

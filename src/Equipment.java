public class Equipment {

    private ItemDefault[] slots = new ItemDefault[8];
    private int selectedSlot = 0;


    public void addItem(ItemDefault item, int slotIndex) {
        if (slotIndex < 0 || slotIndex >= slots.length) {
            System.out.println("Niepoprawny numer slotu!");
            return;
        }

        slots[slotIndex] = item;
        System.out.println(item.name + " został dodany do slotu " + slotIndex);
    }


    public void chooseSlot(int index) {
        if (index < 0 || index >= slots.length) {
            System.out.println("Niepoprawny numer slotu!");
            return;
        }

        selectedSlot = index;

        if (slots[selectedSlot] != null) {
            System.out.println("Wybrano slot " + selectedSlot + ": " + slots[selectedSlot].name);
        } else {
            System.out.println("Slot " + selectedSlot + " jest pusty.");
        }
    }


    public ItemDefault returnSelectedItem() {
        return slots[selectedSlot];
    }


    public void displayEq() {
        System.out.println("\n=== Ekwipunek ===");
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null) {
                System.out.println(i + ": " + slots[i].name + " (Trwałość: " + slots[i].durability + ")");
            } else {
                System.out.println(i + ": [puste]");
            }
        }
    }
}

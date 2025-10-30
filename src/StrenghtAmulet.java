public class StrenghtAmulet extends Item {

    public StrenghtAmulet(String name) {
        super(name, 1);
    }


    public void use(Character player, Character enemy) {
        System.out.println(player.name + " zakłada amulet: " + name);
        player.strength += 100;
        uses -= 1;
        System.out.println("Boost do siły zwiekszony o +1");
        destroy();
    }
}

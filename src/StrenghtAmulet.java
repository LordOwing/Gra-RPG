public class StrenghtAmulet extends Itemy {

    public StrenghtAmulet(String name) {
        super(name, "amulet", 1);
    }

    @Override
    public void use(Character player, Enemy enemy) {
        System.out.println(player.name + " zakłada amulet: " + name);
        player.strength += 1;
        System.out.println("Boost do siły zwiekszony o +1");
        destroy();
    }
}

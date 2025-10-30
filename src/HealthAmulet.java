public class HealthAmulet extends Itemy {

    public HealthAmulet(String name) {
        super(name, "amulet", 1);
    }

    @Override
    public void use(Character player, Enemy enemy) {
        System.out.println(player.name + " zakłada amulet: " + name);
        player.health += 50;
        if (player.health > 1000) player.health = 1000;
        System.out.println("Boost do zdrowia o +50HP");
        destroy();
    }
}

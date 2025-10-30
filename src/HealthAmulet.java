public class HealthAmulet extends Item {

    public HealthAmulet(String name) {
        super(name, 1);
    }


    public void use(Character player, Character enemy) {
        System.out.println(player.name + " zakłada amulet: " + name);
        player.health += 100;
        if (player.health > 1000) player.health = 1000;
        System.out.println("Boost do zdrowia o +100HP");
        destroy();
    }
}

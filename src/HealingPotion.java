public class HealingPotion extends Itemy {

    public HealingPotion(String name, String type, int uses) {
        super(name, type, uses);
    }

    @Override
    public void use(Character player, Enemy enemy) {
        if (uses <= 0) {
            System.out.println(name + " została zużyta.");
            destroy();
            return;
        }

        int missingHp = 1000 - player.health;
        if (missingHp > 0) {
            int heal = Math.min(100, missingHp);
            player.health += heal;
            System.out.println(player.name + " wypił " + name + " i dostał +100HP.");
        } else {
            System.out.println(player.name + " ma pełne zdrowie.");
        }

        uses--;
        if (uses == 0) destroy();
    }
}

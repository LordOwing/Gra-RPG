public class HealingPotion extends Item {

    public HealingPotion(String name, int uses) {
        super(name, uses);
    }


    public void use(Character player, Character enemy) {


        int missingHp = 1000 - player.health;
        if (missingHp > 0) {
            int heal = Math.min(100, missingHp);
            player.health += heal;
            System.out.println(player.name + " wypił " + name + " i dostał +100HP.");
        } else {
            System.out.println(player.name + " ma pełne zdrowie.");
        }

        uses--;
        if (uses == 0){
            destroy();
            System.out.println(name + " została zużyta.");

        }

    }
}

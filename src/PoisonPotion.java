public class PoisonPotion extends Item {

    public PoisonPotion(String name, int uses) {
        super(  name,
                uses
        );
    }


    public void use(Character player, Character enemy) {
        if (uses <= 0) {
            System.out.println(name + " została zużyta.");
            destroy();
            return;
        }

        enemy.health -= 100;
        if (enemy.health < 0) enemy.health = 0;

        System.out.println(player.name + " rzuca " + name + " i wróg dostaje -100HP.");

        uses--;
        if (uses == 0) destroy();
    }
}

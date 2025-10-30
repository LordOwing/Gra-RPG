public class StrenghtPotion extends Item {

    public StrenghtPotion(String name, int uses) {
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

        player.strength += 50;
        System.out.println(player.name + " wypił " + name + " i dostał boosta do siły +50.");

        uses--;
        if (uses == 0) destroy();
    }
}

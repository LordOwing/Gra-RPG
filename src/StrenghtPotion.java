public class StrenghtPotion extends Itemy {

    public StrenghtPotion(String name, String type, int uses) {
        super(  name,
                type,
                uses
        );
    }

    @Override
    public void use(Character player, Enemy enemy) {
        if (uses <= 0) {
            System.out.println(name + " została zużyta.");
            destroy();
            return;
        }

        player.strength += 2;
        System.out.println(player.name + " wypił " + name + " i dostał boosta do siły +2.");

        uses--;
        if (uses == 0) destroy();
    }
}

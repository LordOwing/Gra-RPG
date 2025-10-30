public class Comperable implements Compare{
    @Override
    public void compare() {
        System.out.println("Wywołaj z dwoma argumentami");
    }

    public void compare(Item i1, Item i2) {
        System.out.println(i1.toString() + " " + i2.toString());
    }
    public void compare(Character c1, Character c2) {
        System.out.println(c1.toString() + " " + c2.toString());
    }
}

public class Troll extends MagicalCreature {

    @Override
    public void interact() {
        System.out.println("Троль медленно рычит.");
    }

    @Override
    public void interact(Muggle muggle) {
        System.out.println("Троль пугает магла!");
    }
}

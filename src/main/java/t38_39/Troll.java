package t38_39;

public class Troll extends MagicalCreature {
    @Override
    public void interact() {
        System.out.println("Тролль медленно рычит.");
    };
    @Override
    public void interact(Muggle muggle) {
        System.out.println("Тролль рявкает и пугает магла!");
    }
}

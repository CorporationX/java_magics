package entity.basics_programming.oop_advanced;

public class Troll extends MagicalCreature {
    public Troll() {
        super("Тролль");
    }

    @Override
    void interact() {
        System.out.println(getName() + " медленно рычит.");
    }

    @Override
    void interact(Muggle muggle) {
        System.out.println(getName() + " рявкает и пугает магла!");
    }
}

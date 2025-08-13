package entity.basics_programming.oop_advanced;

public class Hippogriff extends MagicalCreature {
    public Hippogriff() {
        super("Гиппогриф");
    }

    @Override
    void interact() {
        System.out.println(getName() + " кланяется в знак уважения.");
    }

    @Override
    void interact(Muggle muggle) {
        System.out.println(getName() + " смотрит с подозрением.");
    }

}

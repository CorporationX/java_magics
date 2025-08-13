package entity.basics_programming.oop_advanced;

public class Patronus extends MagicalCreature {
    public Patronus() {
        super("Патронус");
    }

    @Override
    void interact() {
        System.out.println(getName() + " освещает пространство и изгоняет дементоров!");
    }

    @Override
    void interact(Muggle muggle) {
        System.out.println(getName() + " не реагирует, ведь маглы его не видят.");
    }
}

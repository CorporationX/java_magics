package entity.basics_programming.oop_advanced.task40;

public class Professor extends Wizard {

    public Professor(String name) {
        super("Профессор " + name);
    }

    @Override
    void castSpell(String spell) {
        System.out.println(name + " применяет " + spell);
    }
}

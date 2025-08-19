package task40;

public class Professor extends Wizard {
    public Professor(String name) {
        super(name);
    }

    @Override
    public void castSpell(String spell) {
        System.out.printf("Профессор %s применяет %s%n", getName(), spell);
    }
}

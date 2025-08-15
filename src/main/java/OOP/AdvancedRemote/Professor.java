package OOP.AdvancedRemote;

public class Professor extends Wizard {
    public Professor() {
        super("Профессор МакГонагалл");
    }

    @Override
    public void castSpell(String spell) {
        System.out.println(name + " применяет " + spell);
    }
}

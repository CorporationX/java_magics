package OOP.AdvancedRemote;

public class Professor extends Wizard {
    public Professor(String name) {
        super(name);
    }

    @Override
    public void castSpell(String spell) {
        System.out.println(name + " применяет " + spell);
    }
}

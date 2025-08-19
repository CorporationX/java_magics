package OOP.AdvancedRemote;

public abstract class Wizard {
    protected String name;

    public Wizard(String name) {
        this.name = name;
    }

    public abstract void castSpell(String spell);
}

abstract class Wizard {
    protected String name;

    public Wizard(String name) {
        this.name = name;
    }

    public abstract boolean castSpell(String spell);
}

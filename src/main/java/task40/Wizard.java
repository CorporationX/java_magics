package task40;

public abstract class Wizard {
    public static final String AVADAKEDAVRA = "Avada Kedavra";

    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void castSpell(String spell);
}

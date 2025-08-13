public class DuelWizard {
    private final String name;

    public String getName() {
        return name;
    }

    public DuelWizard(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " атакует простым заклинанием!");
    }

}

package t32_33;

public class DuelWizard {
    private String name;

    public DuelWizard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println(this.name + " атакует простым заклинанием!");
    }

}

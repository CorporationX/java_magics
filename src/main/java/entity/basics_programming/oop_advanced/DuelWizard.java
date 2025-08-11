package entity.basics_programming.oop_advanced;

public class DuelWizard {
    String name;

    public DuelWizard(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " атакует простым заклинанием!");
    }
}

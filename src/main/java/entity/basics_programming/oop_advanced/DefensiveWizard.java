package entity.basics_programming.oop_advanced;

public class DefensiveWizard extends DuelWizard {
    public DefensiveWizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " сначала возводит защитный барьер, а затем контратакует!");
    }
}

package t32_33;

public class DefensiveWizard extends DuelWizard{
    public DefensiveWizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " сначала возводит защитный барьер, а затем контратакует!");
    }
}


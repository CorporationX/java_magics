public class DefensiveWizard extends DuelWizard{
    public DefensiveWizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " cначала возводит защитный барьер, а затем контратакует!");
    }
}

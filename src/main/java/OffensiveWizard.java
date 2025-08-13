public class OffensiveWizard extends DuelWizard{
    public OffensiveWizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Мощная атака боевым проклятием!");
    }
}

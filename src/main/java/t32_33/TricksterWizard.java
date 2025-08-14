package t32_33;

public class TricksterWizard extends DuelWizard {
    public TricksterWizard(String name) {
        super(name);
    }
    @Override
    public void attack() {
        System.out.println(getName() + " использует ловушки и обманы!");
    }
}

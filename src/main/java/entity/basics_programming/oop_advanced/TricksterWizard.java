package entity.basics_programming.oop_advanced;

public class TricksterWizard extends DuelWizard {
    public TricksterWizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "использует ловушки и обманы!");
    }
}

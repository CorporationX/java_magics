package entity.basics_programming.oop_advanced.task40;

public class DarkWizard extends Wizard {

    public DarkWizard(String name) {
        super(name);
    }

    @Override
    void castSpell(String spell) {
        System.out.println(name + " произносит " + spell);
    }
}

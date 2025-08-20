package task40;

public class DarkWizard extends Wizard {
    public DarkWizard(String name) {
        super(name);
    }

    @Override
    public void castSpell(String spell) {
        System.out.printf("%s произносит %s%n", getName(), spell);
    }
}

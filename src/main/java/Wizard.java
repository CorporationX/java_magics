public class Wizard extends Character {
    private int damage;

    public Wizard(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    @Override
    public void execute(Character wizard) {
        wizard.setHealth(wizard.getHealth() - damage);
    }
}

public class Doctor extends Character {
    private int hp;

    public Doctor(String name, int hp) {
        super(name);
        this.hp = hp;
    }

    @Override
    public void execute(Character wizard) {
        wizard.setHealth(wizard.getHealth() + hp);
    }
}

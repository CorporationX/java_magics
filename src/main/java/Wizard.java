public class Wizard {
    private String name; // Имя
    private int health; // Здоровье
    private int damage;

    public Wizard(String name, int damage) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void hit(Wizard wizard) {
        wizard.setHealth(wizard.getHealth() - damage);
    }
}

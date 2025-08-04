public class Wizard {
    private String name; // Имя
    private int health; // Здоровье

    public Wizard(String name) {
        this.name = name;
        this.health = 100;
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

    public void hit(Wizard wizard, int health) {
        wizard.setHealth(wizard.getHealth() - health);
    }
}

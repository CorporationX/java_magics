public class Workshop2Wizard {

    private String name; // Имя
    private int health;  // Здоровье
    private int damage;  // Урон

    public Workshop2Wizard (String name, int damage) {
        this.damage = damage;
        this.name = name;
        this.health = 100;
//        setDefaultDamage(); // если нужны постоянные величины урона Гарри и Волдеморта
    }

    public Workshop2Wizard (String name) {
        this.name = name;
        this.health = 100;
        setDefaultDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
//        setDefaultDamage(); // если нужны постоянные величины урона Гарри и Волдеморта
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

    public void hit(Workshop2Wizard wizard) {
        wizard.setHealth(wizard.getHealth() - damage);
    }

    private void setDefaultDamage() {
        if (this.name.equals("Гарри Поттер") && this.damage == 0) this.damage = 35;
//        if (this.name.equals("Гарри Поттер")) this.damage = 35; // если нужны постоянные величины урона Гарри и Волдеморта
        if (this.name.equals("Волан-де-Морт") && this.damage == 0) this.damage = 100;
//        if (this.name.equals("Волан-де-Морт")) this.damage = 100; // если нужны постоянные величины урона Гарри и Волдеморта
    }

}

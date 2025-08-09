package entity.workshops.ws2;

import java.util.Random;

public class Wizard {

    private String name; // Имя
    private int health;  // Здоровье
    private int damage;  // Урон

    public Wizard(String name, int damage) {
        this.damage = damage;
        this.name = name;
        this.health = 100;
//        setDefaultDamage(); // если нужны постоянные величины урона Гарри и Волдеморта
    }

    public Wizard(String name) {
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

    private void hit(Wizard wizard) {
        wizard.setHealth(wizard.getHealth() - damage);
    }

    private void setDefaultDamage() {
        if (this.name.equals("Гарри Поттер") && this.damage == 0) this.damage = 35;
//        if (this.name.equals("Гарри Поттер")) this.damage = 35; // если нужны постоянные величины урона Гарри и Волдеморта
        if (this.name.equals("Волан-де-Морт") && this.damage == 0) this.damage = 100;
//        if (this.name.equals("Волан-де-Морт")) this.damage = 100; // если нужны постоянные величины урона Гарри и Волдеморта
    }

    public static void toFight(Wizard wizard1, Wizard wizard2) {
        Random random = new Random();
        System.out.println("Битва: \"" + wizard1.getName() + "\" против \"" + wizard2.getName() + "\" начинается! \n");
        while (true) {
            boolean isHarryTurn = random.nextBoolean();
            if (isHarryTurn) {
                wizard1.hit(wizard2);
                if (wizard2.getHealth() <= 0) {
                    System.out.println("Участник \"" + wizard1.getName() + "\" победил.");
                    break;
                } else
                    System.out.println("Участник \"" + wizard2.getName() + "\" ранен. Его здоровье: " + wizard2.getHealth());
            } else {
                wizard2.hit(wizard1);
                if (wizard1.getHealth() <= 0) {
                    System.out.println("Участник \"" + wizard2.getName() + "\" победил.");
                    break;
                } else System.out.println("Участник \"" + wizard1.getName() + "\" ранен. Его здоровье: " + wizard1.getHealth());
            }
        }
        System.out.println();
    }
}

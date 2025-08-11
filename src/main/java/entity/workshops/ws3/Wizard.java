package entity.workshops.ws3;

import java.util.Random;

public class Wizard extends Character {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void execute(Character wizard) {
        Random damage = new Random();
        // рандомный урон
        if (wizard.getName().equals("Гарри Поттер")) {
            setDamage(damage.nextInt(60, 90));
            System.out.println(wizard.getName() + " получил урон " + getDamage());
        } else if (wizard.getName().equals("Волан-де-Морт")) {
            setDamage(damage.nextInt(30, 55));
            System.out.println(wizard.getName() + " получил урон " + getDamage());
        } else {
            setDamage(damage.nextInt(20, 50));
            System.out.println(wizard.getName() + " получил урон " + getDamage());
        }

        wizard.setHealth(wizard.getHealth() - getDamage());
    }
}


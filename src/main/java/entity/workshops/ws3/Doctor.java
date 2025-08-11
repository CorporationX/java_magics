package entity.workshops.ws3;

import java.util.Random;

public class Doctor extends Character {

    public Doctor(String name) {
        super(name);
    }

    @Override
    public void execute(Character wizard) {
        Random hp = new Random();
        // рандомное лечение
        if (wizard.getName().equals("Гарри Поттер")) {
            int currentHp = hp.nextInt(20, 50);
            wizard.setHealth(wizard.getHealth() + currentHp);
            System.out.println(wizard.getName() + " подлечен на " + currentHp + ", теперь его здоровье: " + wizard.getHealth());
        } else if (wizard.getName().equals("Волан-де-Морт")) {
            int currentHp = hp.nextInt(10, 25);
            wizard.setHealth(wizard.getHealth() + currentHp);
            System.out.println(wizard.getName() + " подлечен на " + currentHp + ", теперь его здоровье: " + wizard.getHealth());
        } else wizard.setHealth(wizard.getHealth() + hp.nextInt(20, 35));
    }
}

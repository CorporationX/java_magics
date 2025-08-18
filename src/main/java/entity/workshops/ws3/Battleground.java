package entity.workshops.ws3;

import java.util.Random;

public class Battleground {
    /*
     * Гарри Поттер бьётся с Волан-де-Мортом. Гарри использует заклинание "Экспелиармус", которое
     * наносит 35 единиц урона, а Волан-де-Морт использует заклинание "Авада Кедавра", которое наносит
     * 100 единиц урона и сразу убивает. Программа рандомно определяет, кто стреляет. Схватка
     * закончится чьей-то смертью. У Гарри шансы не очень, поэтому добавим доктора, который будет
     * лечить его.
     **/

    public static void doBattle() {
        Character harry = new Wizard("Гарри Поттер");
        Character voldemort = new Wizard("Волан-де-Морт");
        Character doc = new Doctor("Док");

        Random random = new Random();

        while (harry.getHealth() > 0 && voldemort.getHealth() > 0) {
            // Доктор смотрит кого лечить. (Лечит того, у кого меньше здоровье)
            // примерно уравновесил шансы. У Волдеморта больше рандомный урон,
            // поэтому у него лечение меньше в пропорциональном соотношении с Гарри
            if (harry.getHealth() < voldemort.getHealth()) {
                doc.execute(harry);
            } else if (harry.getHealth() > voldemort.getHealth()) {
                doc.execute(voldemort);
            } else {
                System.out.println("Здоровье на ровне. " + doc.getName() + " лечит того, у кого меньше \"HP\"");
            }

            boolean isHarryTurn = random.nextBoolean();
            if (isHarryTurn) {
                harry.execute(voldemort);
                printInfo(voldemort);
            } else {
                voldemort.execute(harry);
                printInfo(harry);
            }
        }
    }

    // печать информации о здоровье на экран
    public static void printInfo(Character wizard) {
        if (wizard.getHealth() == 100) {
            System.out.println(wizard.getName() + " здоров. Его здоровье: " + wizard.getHealth());
        } else if (wizard.getHealth() > 0) {
            System.out.println(wizard.getName() + " ранен. Его здоровье: " + wizard.getHealth());
        } else {
            System.out.println(wizard.getName() + " проиграл");
        }
    }
}

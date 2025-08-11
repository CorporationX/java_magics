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
        Character harry = new Wizard("Гарри Поттер", 35);
        Character voldemort = new Wizard("Волан-де-Морт", 100);
        Character doc = new Doctor("Док", 100);

        Random random = new Random();

        while (true) {
            boolean isHarryTurn = random.nextBoolean();
            if (isHarryTurn) {
                harry.execute(voldemort);
                System.out.println(voldemort.getName() + " ранен. Его здоровье: " + voldemort.getHealth());
                if (voldemort.getHealth() < 0) {
                    System.out.println(harry.getName() + " победил.");
                    break;
                }
            } else {
                voldemort.execute(harry);
                System.out.println(voldemort.getName() + " победил.");
                doc.execute(harry);
                System.out.println("Нет, не победил! " + doc.getName() + " воскресил " + harry.getName());
            }
        }
    }
}

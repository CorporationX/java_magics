import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Гарри Поттер бьётся с Волан-де-Мортом. Гарри использует заклинание "Экспелиармус", которое
         * наносит 35 единиц урона, а Волан-де-Морт использует заклинание "Авада Кедавра", которое наносит
         * 100 единиц урона и сразу убивает. Программа рандомно определяет, кто стреляет. Схватка
         * закончится чьей-то смертью.
         **/

        Wizard harry = new Wizard("Гарри Поттер", 35);
        Wizard voldemort = new Wizard("Волан-де-Морт", 100);

        Random random = new Random();

        while (true) {
            boolean isHarryTurn = random.nextBoolean();
            if (isHarryTurn) {
                harry.hit(voldemort);
                System.out.println(voldemort.getName() + " ранен. Его здоровье: " + voldemort.getHealth());
                if (voldemort.getHealth() < 0) {
                    System.out.println(harry.getName() + " победил.");
                    break;
                }
            } else {
                voldemort.hit(harry);
                System.out.println(voldemort.getName() + " победил.");
                break;
            }
        }
    }
}

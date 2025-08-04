import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Гарри Поттер бьётся с Волан-де-Мортом. Гарри использует заклинание "Экспелиармус", которое
         * наносит 35 единиц урона, а Волан-де-Морт использует заклинание "Авада Кедавра", которое наносит
         * 100 единиц урона и сразу убивает. Программа рандомно определяет, кто стреляет. Схватка
         * закончится чьей-то смертью.
         **/

        // TODO 1. избавиться от чисел в методе hit
        // TODO 2. найти и исправить как минимум 1 нюанс в коде
        Wizard harry = new Wizard("Гарри Поттер");
        Wizard voldemort = new Wizard("Волан-де-Морт");

        Random random = new Random();

        while (true) {
            boolean isHarryTurn = random.nextBoolean();
            if (isHarryTurn) {
                harry.hit(voldemort, 35);
                System.out.println("Волан-де-Морт ранен. Его здоровье: " + voldemort.getHealth());
                if (voldemort.getHealth() < 0) {
                    System.out.println("Гарри победил.");
                    break;
                }
            } else {
                voldemort.hit(harry, 100);
                System.out.println("Волан-де-Морт победил.");
                break;
            }
        }
    }
}

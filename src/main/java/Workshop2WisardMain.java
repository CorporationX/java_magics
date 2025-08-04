import java.util.Random;

public class Workshop2WisardMain {

    public static void main(String[] args) {
        /*
         * Гарри Поттер бьётся с Волан-де-Мортом. Гарри использует заклинание "Экспелиармус", которое
         * наносит 35 единиц урона, а Волан-де-Морт использует заклинание "Авада Кедавра", которое наносит
         * 100 единиц урона и сразу убивает. Программа рандомно определяет, кто стреляет. Схватка
         * закончится чьей-то смертью.
         **/

        // TODO 1. избавиться от чисел в методе hit
        // TODO 2. найти и исправить как минимум 1 нюанс в коде
        // Изменил метод hit, добавил возможность варьировать урон, но по умолчанию оставил значения из условия
        // Изменил немного логику цикла, чтобы не отображались отрицательные значения
        // добавил методы гет в вывод, чтобы подтягивал имена из конструкторов

        Workshop2Wizard harry = new Workshop2Wizard("Гарри Поттер");
//        Wizard harry = new Wizard("Гарри Поттер", 35); // ввел конструктор с возможным уроном
        Workshop2Wizard voldemort = new Workshop2Wizard("Волан-де-Морт");

        // если урон не задан, то значения по умолчанию у Гарри 35, у Волдеморта 100
//        harry.setDamage(55);

        Random random = new Random();

        while (true) {
            boolean isHarryTurn = random.nextBoolean();
            if (isHarryTurn) {
                harry.hit(voldemort);
                if (voldemort.getHealth() <= 0) {
                    System.out.println(harry.getName() + " победил.");
                    break;
                } else
                    System.out.println(voldemort.getName() + " ранен. Его здоровье: " + voldemort.getHealth());
            } else {
                voldemort.hit(harry);
                if (harry.getHealth() <= 0) {
                    System.out.println(voldemort.getName() + " победил.");
                    break;
                } else System.out.println(harry.getName() + " ранен. Его здоровье: " + harry.getHealth());
            }
        }
    }
}

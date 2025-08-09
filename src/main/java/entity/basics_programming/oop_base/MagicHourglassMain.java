package entity.basics_programming.oop_base;

public class MagicHourglassMain {
    public static void main(String[] args) {
        MagicHourglass hourglass = new MagicHourglass();

        System.out.println("Осталось: " + hourglass.getTime() + " секунд"); // ➡ Осталось: 60 секунд

        hourglass.tick();
        hourglass.tick();
        System.out.println("Осталось: " + hourglass.getTime() + " секунд"); // ➡ Осталось: 58 секунд

        hourglass.flip(45); // ➡ 🔄 Вы перевернули песочные часы! Времени теперь: 45 секунд.
        System.out.println("Осталось: " + hourglass.getTime() + " секунд"); // ➡ Осталось: 45 секунд

        hourglass.stop(); // ➡ ⏳ Часы остановлены.
        hourglass.tick(); // ➡ ⏳ Часы не идут! Переверните их.

        hourglass.start(); // ➡ ▶ Часы снова идут!

        hourglass.flip(5); // ➡ 🔄 Вы перевернули песочные часы! Времени теперь: 60 секунд.
        System.out.println("Осталось: " + hourglass.getTime() + " секунд"); // ➡ Осталось: 60 секунд

        hourglass.flip(10);
        hourglass.start(); // ➡ ▶ Часы снова идут!
        for (int i = 1; i <= 9; i++) {
            hourglass.tick();
        }
        hourglass.tick();
        hourglass.flip(75);
        System.out.println("Осталось: " + hourglass.getTime() + " секунд"); // ➡ Осталось: 1 секунда
    }
}

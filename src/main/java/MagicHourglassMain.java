public class MagicHourglassMain {
    public static void main(String[] args) {
        MagicHourglass hourglass = new MagicHourglass();

        System.out.println("Осталось: " + hourglass.getSecondsLeft() + " секунд"); // ➡ Осталось: 60 секунд

        hourglass.tick();
        hourglass.tick();
        System.out.println("Осталось: " + hourglass.getSecondsLeft() + " секунд"); // ➡ Осталось: 58 секунд

        hourglass.flip(45);
        System.out.println("Осталось: " + hourglass.getSecondsLeft() + " секунд"); // ➡ 🔄 Вы перевернули песочные часы! Времени теперь: 45 секунд.

        hourglass.stop(); // ➡ ⏳ Часы остановлены.
        hourglass.tick(); // ➡ ⏳ Часы не идут! Переверните их.

        hourglass.start(); // ➡ ▶ Часы снова идут!

        hourglass.flip(5);
        System.out.println("Осталось: " + hourglass.getSecondsLeft() + " секунд"); // ➡ 🔄 Вы перевернули песочные часы! Времени теперь: 60 секунд.

        hourglass.start(); // ➡ ▶ Часы снова идут!

    }
}

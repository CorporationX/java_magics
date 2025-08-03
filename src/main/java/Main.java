public class Main {
    public static void main(String[] args) {
        // Задача 16
//        Wand wand1 = new Wand("Тис", "Перо феникса", 34);
//        System.out.println("Палочка 1: " + wand1.woodType + ", ядро: " + wand1.core + ", длина: " + wand1.length + " см");
//
//        Wand wand2 = new Wand("Ясень", "Волос единорога", 30);
//        System.out.println("Палочка 2: " + wand2.woodType + ", ядро: " + wand2.core + ", длина: " + wand2.length + " см");

        // Задача 17
//        Wand harryWand = new Wand("Тис", "Перо феникса", 34);
//        HogwartsStudent harry = new HogwartsStudent("Гарри Поттер", 11, harryWand);
//        System.out.println("Ученик: " + harry.name + ", возраст: " + harry.age + ", палочка: " + harry.wand.woodType);
//
//        HogwartsStudent tom = new HogwartsStudent("Том Реддл", 16);
//        System.out.println("Ученик: " + tom.name + ", возраст: " + tom.age + ", палочка: нет");

        // Задача 22
//        MagicThermometer thermometer = new MagicThermometer();
//        System.out.println(thermometer.getTemperature());  // ➡ 10°C (начальная температура)
//
//        thermometer.increase(50);
//        System.out.println(thermometer.getTemperature());  // ➡ 60°C
//
//        thermometer.increase(50);
//        thermometer.increase(-50); // Отрицательное значение
//        System.out.println(thermometer.getTemperature());  // ➡ 100°C (и предупреждение)
//
//        thermometer.decrease(95);
//        thermometer.decrease(-95); // Отрицательное значение
//        System.out.println(thermometer.getTemperature());  // ➡ 10°C (и предупреждение)

        // Задача 23
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
//        hourglass.start(); // ➡ ▶ Часы снова идут!
        for (int i = 1; i <= 9; i++) {
            hourglass.tick();
        }
        hourglass.tick();
//        hourglass.flip(75);
        System.out.println("Осталось: " + hourglass.getTime() + " секунд"); // ➡ Осталось: 1 секунда
    }
}

public class MagicThermometer {
    private int temperature = 10;

//    Тестирование

//    public static void main(String[] args) {
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
//    }

    public int getTemperature() {
        return temperature;
    }
    void increase (int value) {
        if (value < 0) {
            System.out.println("❌ Ошибка! Нельзя увеличивать температуру на отрицательное значение.");
            return;
        }
        temperature += value;
        if (temperature > 100) {
            temperature = 100;
            System.out.println("❌ Максимальная температура — 100°C. Дальше зелье может испариться!");
        }
    }
    void decrease(int value) {
        if (value < 0) {
            System.out.println("❌ Ошибка! Нельзя уменьшать температуру на отрицательное значение.");
            return;
        }
        temperature -= value;
        if (temperature < 10) {
            temperature = 10;
            System.out.println("❌ Минимальная температура — 10°C. Зелье замёрзнет!");
        }
    }
}

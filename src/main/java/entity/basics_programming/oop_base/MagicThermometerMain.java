package entity.basics_programming.oop_base;

public class MagicThermometerMain {
    public static void main(String[] args) {
        MagicThermometer thermometer = new MagicThermometer();
        System.out.println(thermometer.getTemperature());  // ➡ 10°C (начальная температура)

        thermometer.increase(50);
        System.out.println(thermometer.getTemperature());  // ➡ 60°C

        thermometer.increase(50);
        thermometer.increase(-50); // Отрицательное значение
        System.out.println(thermometer.getTemperature());  // ➡ 100°C (и предупреждение)

        thermometer.decrease(95);
        thermometer.decrease(-95); // Отрицательное значение
        System.out.println(thermometer.getTemperature());  // ➡ 10°C (и предупреждение)
    }
}

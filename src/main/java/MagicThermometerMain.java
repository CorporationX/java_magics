public class MagicThermometerMain {
    public static void main(String[] args) {
        MagicThermometer thermometer = new MagicThermometer();
        System.out.println(thermometer.getTemperature());  // ➡ 10°C (начальная температура)

        thermometer.increase(50);
        System.out.println(thermometer.getTemperature());  // ➡ 60°C

        thermometer.increase(50);
        System.out.println(thermometer.getTemperature());  // ➡ 100°C (и предупреждение)

        thermometer.decrease(95);
        System.out.println(thermometer.getTemperature());  // ➡ 10°C (и предупреждение)
    }
}

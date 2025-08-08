package t22_24;

public class MagicThermometerMain {
    public static void main(String[] args) {
        MagicThermometer thermometer = new MagicThermometer();
        System.out.println("Начальная температура: " + thermometer.getTemperature());

        thermometer.increaseTemperature(50);
        System.out.println("Текущая температура: " + thermometer.getTemperature());

        thermometer.increaseTemperature(50);
        System.out.println("Текущая температура: " + thermometer.getTemperature());

        thermometer.increaseTemperature(50);
        System.out.println("Текущая температура: " + thermometer.getTemperature());

        thermometer.decreaseTemperature(50);
        System.out.println("Текущая температура: " + thermometer.getTemperature());

        thermometer.decreaseTemperature(50);
        System.out.println("Текущая температура: " + thermometer.getTemperature());
    }


}

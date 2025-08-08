package t22_24;

public class MagicThermometer {
    private int temperature = 10;

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature(int value) {
        if (temperature + value > 100) {
            temperature = 100;
            System.out.println("Предупреждение! Нельзя выставлять температуру больше 100!");
        } else {
            temperature += value;
        }
    }

    public void decreaseTemperature(int value) {
        temperature -= value;
        if (temperature < 10) {
            temperature = 10;
            System.out.println("Предупреждение! Нельзя устанавливать температуру меньше 10");
        }
    }
}

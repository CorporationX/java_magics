public class MagicThermometer {
    private int temperature = 10;

    public int getTemperature() {
        return temperature;
    }

    public void increase(int value) {
    if (value < 0) {
        System.out.println("Ошибка! Нельзя увеличивать температуру на отрицательное значение.");
        return;
    }
        temperature += value;
        if (temperature > 100) {
            temperature = 100;
            System.out.println("Слишком высокая температура");
        }
    }

    public void decrease(int value) {
        if (value < 0) {
            System.out.println("Ошибка! Нельзя уменьшать температуру на отрицательное значение.");
            return;
        }
        temperature -= value;
        if (temperature < 10) {
            temperature = 10;
            System.out.println("Слишком низкая температура");
        }
    }
}

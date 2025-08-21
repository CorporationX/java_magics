public class MagicThermometer {
    private int temperature = 10; // Начальная температура

    // 1. Геттер возвращает текущую температуру.
    public int getTemperature () {
        return temperature;
    }

    // 2.Увеличиваем температуру.
    public void increase(int value) {
        temperature += value;
        if (temperature > 100) {
            temperature = 100;
            System.out.println("Максимальная температура - 100°C. Дальше зелье может испариться!");
        }
    }
    // 3. Уменьшаем температуру.
    public void decrease(int value) {
        if (temperature < 0) {
            System.out.println("Ошибка! Зелье не может быть снижено до отрицательного значения!");
            return;
        }
        temperature -= value;
        if (temperature < 10) {
            temperature = 10;
            System.out.println("Минимальная температура 10°C. Зелье замерзает!");
        }

    }

}

public class MagicThermometer {
    private int temperature = 10;
    public int getTemperature() {
        return temperature;
    }
    //при написании не учёл проверку на отрицательное значение, только при проверке дошло
     public void increase(int value) {
        if (value < 0 ) {
            System.out.println("Ошибка. Нельзя увеличивать на отрицательное значение.");
            return;
        }
        temperature += value;
        if (temperature > 100) {
            temperature = 100;
            System.out.println("Максимальная температура - 100°C. Дальше зелье может испариться!");
        }
     }
     public void decrease(int volue) {
        if (volue > 0) {
            System.out.println("Ошибка, нельзя уменьшать на отрицательное значение.");
            return;
        }
        temperature -= volue;
        if (temperature < 10) {
            temperature = 10;
            System.out.println("Минимальная температура - 10°C. Зелье замёрзнет!");
        }
     }

}
import java.util.Random;

public class SpeedCalculator {
    public static void main(String[] args) {
        // Создаем массив скоростей игроков и заполняем его случаными числами
        double[] speed = new double[7];
        for (int i = 0; i < speed.length; i++) {
            speed[i] = new Random().nextDouble()* 10 + 15;
        }

        // Вывод скоростей на экран
        for (double speeds : speed) {
            System.out.println(speeds);
        }

        // Находим сумму всех скоростей
        double sum = 0;
        for (double v : speed) {
            sum += v;
        }

        // Находим среднюю скорость
        double averageSpeed = sum / speed.length;

        // Выводим результаты на экран
        System.out.println("Сумма всех скоростей команды = " + sum);
        System.out.println("Средняя скорость команды = " + averageSpeed);
    }
}

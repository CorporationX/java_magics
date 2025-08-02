import java.util.Random;

public class SpeedCalculator {
    public static void main(String[] args) {

        Random random = new Random();
        double[] speed = new double[7];
        double sum = 0;

        System.out.println("Скорость игрока: ");
        for (int i = 0; i < speed.length; i++) {
            speed[i] = 15.0 + random.nextDouble() * 10;
            sum += speed[i];
            System.out.print(speed[i] + " ");//меня очень смущает вся эта структура, какая-то странная, не логичная...
        }
        double averageSpeed = sum / speed.length;

        System.out.println("Суммарная скорость: " + sum);//не понимаю как правильно вывести это на новую строку
        System.out.println("Средняя скорость: " + averageSpeed);
    }
}

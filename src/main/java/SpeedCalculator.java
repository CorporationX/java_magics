import java.util.Random;

public class SpeedCalculator {
    public static void main(String[] args) {

        Random random = new Random();
        double[] speeds = new double[7]; // количество игроков
        double sum = 0;

        //Присваиваем рандомную скорость игрокам
        System.out.println("Скорости игроков: ");
        for (int i = 0; i < speeds.length; i++) {
            speeds[i] = 15.0 + random.nextDouble() * 10;
            sum += speeds[i];
            System.out.print(speeds[i] + " ");
        }
        double averageSpeed = sum / speeds.length;
        System.out.println("Средняя скорость: " + averageSpeed);
    }
}

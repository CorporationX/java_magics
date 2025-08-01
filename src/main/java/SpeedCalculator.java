import java.util.Random;

public class SpeedCalculator {
    public static void main(String[] args) {
        Random random = new Random();

        double[] speeds = new double[7];
        double t;
        for (int i = 0; i < speeds.length; i++) {
//            speeds[i] = random.nextDouble(15, 26);
            t = random.nextDouble();
            speeds[i] = 15.0 + t * 10;
            System.out.println(t);
        }
        System.out.println("\n\n");
        double sum = 0;
        double avg;

        for (double i : speeds) {
            sum += i;
            System.out.println(i);
        }

        avg = sum / speeds.length;

        System.out.println("Средняя скорость команды: " + avg);
    }
}

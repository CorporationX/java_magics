import java.util.Random;

public class SpeedCalculator {
    public static void main(String[] args){
        int[] speeds = new int[7];
        Random random = new Random();
        double sum = 0;
        for(int i = 0;i < speeds.length; i++ ){
            speeds[i] = 15 + random.nextInt(11);
            sum += speeds[i];
            System.out.print(speeds[i] + " " + "\n");
        }
        double averageSpeed = sum / speeds.length;

        System.out.println("Суммарная скорость: " + sum);
        System.out.println("Средняя скорость: " + averageSpeed);
    }
}

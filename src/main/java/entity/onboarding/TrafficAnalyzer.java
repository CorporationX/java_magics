package entity.onboarding;

import java.util.Random;

public class TrafficAnalyzer {
    static void main() {
        int[] traffic = new int[10];
        Random random = new Random();

        System.out.println("Дан массив:");
        for (int i = 0; i < traffic.length; i++) {
            traffic[i] = random.nextInt(0, 101);
            System.out.print(traffic[i] + " ");
        }

        System.out.printf("\nмаксимальный трафик = %d", getMaxTraffic(traffic));
    }

    public static int getMaxTraffic(int[] traffic) {
        int maxTraffic = 0;
        for (int j : traffic) {
            if (j > maxTraffic) {
                maxTraffic = j;
            }
        }
        return maxTraffic;
    }
}

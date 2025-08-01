import java.util.Arrays;
import java.util.Random;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class NumbersAnalyzer {
    public static void main(String[] args) {
        // Создаем массив из 5 целых чисел и заполняем его рандомными значениями от -50 до 50
        int[] arr = new int[5];
        Random random = new Random();
        int min = MAX_VALUE;
        int max = MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-50, 51);
            System.out.print(arr[i] + " ");    // выводим числа на экран
            if (arr[i] <= min) min = arr[i];   // находим минимальное
            if (arr[i] > max) max = arr[i];    // и максимальное значения массива
        }

        // Выводим min и max значения на экран
        System.out.println("\nmin: " + min + "\nmax: " + max);
    }
}

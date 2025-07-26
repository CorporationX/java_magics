import java.util.Random;

public class NumbersAnalyzer {
    public static void main(String[] args) {
        // Создаем массив из 5 целых чисел и заполняем его рандомными значениями от -50 до 50
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-50, 51);
        }

        // выводим числа на экран
        for (int array : arr) {
            System.out.print(array + " ");
        }

        // находим минимально и максимальное значения массива
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        // Выводим min и max значения на экран
        System.out.println("\nmin: " + min + "\nmax: " + max);
    }
}

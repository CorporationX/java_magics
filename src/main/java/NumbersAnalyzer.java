public class NumbersAnalyzer {
    public static void main(String[] args) {
        int[] num = {1, 14, 7, 31, 53};

        int min = num[0];
        int max = num[0];
        for (int j : num) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
                System.out.println("Минимальное число: " + min + "\n" + "Максимальное число: " + max);
            }
        }
    }
}

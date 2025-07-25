public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 222; i <= 444; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

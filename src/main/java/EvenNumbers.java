public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 222; i <= 444; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println("ТЕКУЩЕЕ четное число: " + i);
                System.out.println("ТЕКУЩАЯ Сумма всех четных чисел: " + sum + "\n");
            }
        }
        System.out.println("Сумма всех четных чисел: " + sum);
    }
}

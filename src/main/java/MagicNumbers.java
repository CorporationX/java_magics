import java.util.Random;

public class MagicNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(1, 101);
        int number2 = random.nextInt(1, 101);

        int result;


        if (number % 2 == 0 && number2 % 2 == 0) {
            result = (number / 2) + (number2 / 2);
        } else if (number % 2 == 0 && number2 % 2 != 0) {
            result = (number / 2) + number2;
        } else if (number % 2 != 0 && number2 % 2 == 0) {
            result = (number2 / 2) + number;
        } else {
           result = number + number2;
        }

        System.out.println("Вот что вышло: " + result);
    }
}


import java.util.Random;

public class MagicNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt();
        int num2 = random.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println((num1 / 2 + num2 / 2));
        } else if (num1 % 2 == 0) {
            System.out.println(num1 / 2 + num2);
        } else if (num2 % 2 == 0) {
            System.out.println(num1 + num2 /2);
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println((num1 + num2));
        }
        }
    }


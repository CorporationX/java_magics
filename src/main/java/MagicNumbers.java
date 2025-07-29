import java.util.Random;

public class MagicNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(1,11);
        int num2 = random.nextInt(1,11);

        boolean isNum1Even = num1 % 2 == 0;
        boolean isNum2Even = num2 % 2 == 0;

        int result;
        if (isNum1Even && isNum2Even) {
            result = num1 / 2 + num2 / 2;
        } else if (isNum1Even && !isNum2Even) {
            result = num1 / 2 + num2;
        } else if (!isNum1Even && isNum2Even) {
            result = num1 + num2 / 2;
        } else {
            result = num1 + num2;
        }
        System.out.println("Сгенерированные числа: " + num1 + ", " + num2);
        System.out.println("Рузультат: " + result);
    }
}

import java.util.Random;

public class MagicNumbers {
    public static void main(String[] args) {
        int number1 = new Random().nextInt(1, 101);
        int number2 = new Random().nextInt(1, 101);
        System.out.println("number1 = " + number1 + "\nnumber2 = " + number2);

        int sum;
        if (number1 % 2 == 0 && number2 % 2 == 0) {
            System.out.println("Оба числа четные. Каждое число делим на 2 и находим их сумму");
            sum = number1 / 2 + number2 / 2;
        } else if (number1 % 2 == 0) {
            System.out.println("Только первое число четное. Делим его на 2 и складываем со вторым числом");
            sum = number1 / 2 + number2;
        } else if (number2 % 2 == 0) {
            System.out.println("Только второе число четное. Делим его на 2 и складываем с первым числом");
            sum = number1 + number2 / 2;
        } else {
            System.out.println("Оба числа нечетные. Находим их сумму");
            sum = number1 + number2;
        }
        System.out.println("Сумма = " + sum);
    }
}

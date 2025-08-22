import java.util.Random;
public class MagicNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(1, 101); // Число от 1 до 100
        int number2 = random.nextInt(1, 101); // Число от 1 до 100

        // Проверка чисел
        if (number1 % 2 == 0) {
            System.out.println("Число чётное!");
        } else {
            System.out.println("Число не чётное!");
        }
        if (number2 % 2 == 0) {
            System.out.println("Число чётное!");
        } else {
            System.out.println("Число не чётное!");
        }

        // Проверка условий
      if (number1 % 2 == 0 && number2 % 2 == 0) {
          System.out.println(number1 / 2 + number2 / 2);
        }
      if (number1 % 2 == 0 && number2 % 2 != 0) {
          System.out.println(number1 / 2 + number2);
        }
      if (number1 % 2 != 0 && number2 % 2 == 0) {
          System.out.println(number1 + number2 / 2);
        }
      if (number1 % 2 != 0 && number2 % 2 != 0) {
          System.out.println(number1 + number2);
        }
    }
}


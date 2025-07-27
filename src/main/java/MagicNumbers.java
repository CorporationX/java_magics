import java.util.Random;

public class MagicNumbers {
    public static void main(String[] args){
        Random random = new Random();
        int num1 = random.nextInt(0,10);
        int num2 = random.nextInt(3,17);

        if(num1%2==0 && num2%2==0){
            System.out.println("Первое условие: " + (num1/2 + num2/2));
        } else if(num1 % 2 == 0){
            System.out.println("Второе условие: " + (num1/2 + num2));
        } else if(num2 % 2 == 0){
            System.out.println("Третье условие: " + (num1 + num2/2));
        } else {
            System.out.println("Четвёртое условие: " + (num1 + num2));
        }
    }
}

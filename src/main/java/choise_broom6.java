import java.util.Random;

public class choise_broom6 {
    public static void main(String[] args) {
        Random random =  new Random();

        int speed = random.nextInt(80, 170) ;

        if (speed > 150) {
            System.out.println("Категория: Метла для профессионального квиддича. \n Скорость метлы: " + speed);
        } else if (speed >= 100) {
            boolean b = speed >= 150;
            System.out.println("Категория: Отличная метла для ученика. \n Скорость метлы: " + speed);
        } else {
            System.out.println("Категория: только для обучения. \n Скорость метлы: " + speed);
        }
    }
}

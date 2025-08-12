import java.util.Random;

public class ChoosingBroom {
    public static void main(String[] args) {
        int speed = 120; //Скорость метлы Гарри

        if (speed > 150) {
            System.out.println("Категория: Метла для профессионального квиддича");
        } else if (speed > 100) {
            System.out.println("Категория: Отличная метла для ученика");
        } else {
            System.out.println("Категория: Только для обучения");
        }
    }
}

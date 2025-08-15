package entity.basics_programming.exceptions;

import java.util.Random;

public class HarryLetter {
    public static void main(String[] args) {

        Random random = new Random();
        String[] letter = {null, "Дорогой", "профессор", "Дамблдор", null, "отправьте", "сову"};

        for (int i = 0; i <= 10; i++) {
            try {
                int index = random.nextInt(9); // Иногда выходит за границы массива
                System.out.println("Гарри пишет слово: \"" + letter[index] +
                        "\" из " + letter[index].length() + " букв");
            } catch (NullPointerException e) {
                System.out.println("⚠\uFE0F Перо перестало писать! Гарри встряхивает перо и пробует снова!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("⚠\uFE0F Чернила закончились! Гарри макает перо в чернильницу.");
            } finally {
                System.out.println("Гарри продолжает писать письмо...\n");
            }
        }
    }
}

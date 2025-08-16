package Exceptions;

import java.util.Random;

public class HarryLetter {
    public static void main(String[] args) {
        String[] letter = {"Дорогой", null, "профессор", "Дамблдор", null, "отправьте", "сова"};

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                int index = random.nextInt(8);
                System.out.println("Гарри пишет слово: " + letter[index] + " из " + letter[index].length() + " букв");
            } catch (NullPointerException e) {
                System.out.println("Гарри встряхивает перо и пробует снова!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Гарри макает перо в чернильницу.");
            } finally {
                System.out.println("Гарри продолжает писать письмо...");
            }
        }
    }
}

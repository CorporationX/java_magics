package t41_42;

import java.util.Random;

public class HarryLetter {
    public static void main(String[] args) {
        String[] letter = {"Дорогой", null, "профессор", "Дамблдор", null, "отправьте", "сову"};
        Random random = new Random();

        int index;
        for (int i = 0; i < letter.length; i++) {
            index = random.nextInt(8);
            try {
                System.out.println("Гарри пишет слово: \"" + letter[index] + "\" из " + letter[index].length() + " букв -> " + index);
            } catch (NullPointerException e) {
                System.out.println("Перо перестало писать! Гарри встряхивает перо и пробует снова! -> " + letter[index] + " " + index);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Чернила закончились! Гарри макает перо в чернильницу. - > " + index);
            } finally {
                System.out.println("Гарри продолжает писать письмо...\n");
            }

        }
    }
}

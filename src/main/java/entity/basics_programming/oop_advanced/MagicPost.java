package entity.basics_programming.oop_advanced;

public class MagicPost {
    static int totalLetters = 0; // Общее количесвто отправленных писем

    //метод, который отправляет письмо и увеличивает totalLetters.
    public static void sendLetter(String sender, String recipient) {
        System.out.println(sender + " отправляет письмо " + recipient + " 📜");
        totalLetters++;
    }

    // метод, который показывает, сколько всего писем отправлено.
    static void showTotalLetters() {
        System.out.println("Всего писем отправлено: " + totalLetters);
    }
}

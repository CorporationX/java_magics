package t29_30;

public class MagicPost {
    private static int totalLetters = 0;

    static void sendLetter(String sender, String recipient) {
        System.out.println(sender + " отправил письмо " + recipient);
        totalLetters++;
    }

    static void showTotalLetters() {
        System.out.println("Всего писем отправлено: " + totalLetters);
    }

}

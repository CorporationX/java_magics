public class MagicPost {
    static int totalLetter = 0;

    public static void sendLetter(String sender, String recipient ) {
        System.out.println(sender + " отправил письмо " + recipient);
        totalLetter++;
    }

    static void showTotalLetters() {
        System.out.println(totalLetter);
    }
}

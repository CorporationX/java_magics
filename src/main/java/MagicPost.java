public class MagicPost {
    static int totalLetters = 0; // Статистическое поле: общее

    //Статический метод: отправляет письмо
    static void sendLetter(String sender, String recipient) {
        System.out.println(sender + " отправил письмо " + recipient + " 📜");
        totalLetters++; // Увеличиваем счётчик писем
    }
    // Статический метод: показывает, сколько всего отправлено писем
    static void showTotalLetters() {
        System.out.println("Всего отправленных писем: " + totalLetters);
    }
}

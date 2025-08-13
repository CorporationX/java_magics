package t29_30;

public class MagicMail {
    public static void main(String[] args) {
        Student harry = new Student("Гарри");
        Student ron = new Student("Рон");

        harry.sendPersonalLetter("Рон");
        ron.sendPersonalLetter("Гарри");
        MagicPost.showTotalLetters();

        harry.sendPersonalLetter("Рон");
        harry.sendPersonalLetter("Рон");
        harry.sendPersonalLetter("Рон");
        MagicPost.showTotalLetters();
    }
}

public class MagicMail {
    public static void main(String[] args) {
        Student harry = new Student("Гарри");
        Student hermione = new Student("Гермиона");

        harry.sendPersonalLetter("Рон");
        hermione.sendPersonalLetter("Гарри");

        MagicPost.showTotalLetters();

    }
}

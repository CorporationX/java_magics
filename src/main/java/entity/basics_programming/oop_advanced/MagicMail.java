package entity.basics_programming.oop_advanced;

public class MagicMail {
    public static void main(String[] args) {
        Student harry = new Student("Гарри");
        Student ron = new Student("Рон");
        Student germiona = new Student("Гермиона");

        harry.sendPersonalLetter(ron.getName());
        germiona.sendPersonalLetter(harry.getName());

        MagicPost.showTotalLetters();
    }
}

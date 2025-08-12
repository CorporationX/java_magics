public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }
    public void sendPersonalLetter(String recipient) {
        MagicPost.sendLetter(this.name, recipient);
    }
}

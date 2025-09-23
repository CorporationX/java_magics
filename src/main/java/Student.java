public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void sendPersonalLetter(String recipient) {
        MagicPost.sendLetter(this.name, recipient); // Вызываем `static`-метод
    }
}

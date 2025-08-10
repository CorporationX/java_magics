package entity.basics_programming.oop_advanced;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    public void sendPersonalLetter(String recipient) {
        MagicPost.sendLetter(this.name, recipient);
    }


}

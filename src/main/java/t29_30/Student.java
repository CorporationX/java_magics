package t29_30;

public class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void sendPersonalLetter(String recipient) {
        MagicPost.sendLetter(this.studentName, recipient);
    }

}


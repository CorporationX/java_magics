public abstract class Professor {
    private String name;
    private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void introduce() {
        System.out.println("Имя преподавателя: " + name + "\n" + "Предмет: " + subject);
    }

    abstract void teach ();
}

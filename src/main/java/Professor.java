abstract class Professor {
    private String name;
    private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("Профессор " + name + " ведёт урок " + subject + ".");
    }

    public abstract void teach();
}

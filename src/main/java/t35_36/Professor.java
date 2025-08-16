package t35_36;

abstract public class Professor {
    private String name;
    private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void introduce() {
        System.out.printf("Профессор %s ведёт предмет: %s.%n",name, subject );
    }

    public abstract void teach();
}

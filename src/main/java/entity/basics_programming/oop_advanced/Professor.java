package entity.basics_programming.oop_advanced;

abstract class Professor {
    private String name;
    private String subject;

    public void introduce() {
        System.out.println("Профессор " + this.name + " ведет предмет: " + this.subject);
    }

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void teach();
}

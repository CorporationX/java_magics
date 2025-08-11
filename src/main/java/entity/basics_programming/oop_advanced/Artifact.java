package entity.basics_programming.oop_advanced;

public class Artifact {
    private String name;

    public Artifact(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("Артефакт используется..");
    }
}

public class Artifact {
    private final String name;

    public Artifact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void use() {
        System.out.println("Артефакт используется: " + getName());
    }
}

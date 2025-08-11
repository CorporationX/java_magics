package entity.basics_programming.oop_advanced;

public class PotterArtifact extends Artifact {
    public PotterArtifact(String name) {
        super(name);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Используется защитная магия!");

    }
}

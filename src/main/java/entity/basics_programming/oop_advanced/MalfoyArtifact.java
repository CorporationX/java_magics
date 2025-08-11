package entity.basics_programming.oop_advanced;

public class MalfoyArtifact extends Artifact {

    public MalfoyArtifact(String name) {
        super(name);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Используется тёмная магия!");
    }
}

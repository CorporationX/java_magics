package t32_33;

public class MalfoyArtifact extends Artifact {
    private String name;

    public MalfoyArtifact(String name) {
        super(name);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Используется темная магия!");
    }
}

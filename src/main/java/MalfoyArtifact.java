public class MalfoyArtifact extends Artifact{

    public MalfoyArtifact(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("\nАртефакт используется: " + getName());
        System.out.println("Используется тёмная магия!");
    }
}

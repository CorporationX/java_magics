public class PotterArtifact extends Artifact{

    public PotterArtifact(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("Артефакт используется: " + getName());
        System.out.println("Используется защитная магия!");
    }
}

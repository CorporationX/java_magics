class PotterArtifact extends Artifact {
    public PotterArtifact(String name) {
        super(name);
    }
    @Override
    public void use() {
        super.use();
        System.out.println("Использует защитную магию!");
    }
}

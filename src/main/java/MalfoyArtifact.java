class MalfoyArtifact extends Artifact {
    public MalfoyArtifact(String name) {
        super(name);
    }
    @Override
    public void use() {
        super.use();
        System.out.println("Использует тёмную магию!");
    }
}

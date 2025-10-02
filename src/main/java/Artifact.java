class Artifact {
    private String name;

    public Artifact(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("Артефакт используется...");
    }

static class PotterArtifact extends Artifact {
    public PotterArtifact(String name) {
        super(name);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Используется защитная магия!");
    }
}

static class MalfoyArtifact extends Artifact {
    public MalfoyArtifact(String name) {
        super(name);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Используется тёмная магия!");
    }
}
}


package entity.basics_programming.oop_advanced;

public class PercyWeasley implements ArtifactExpert {
    @Override
    public void studyArtifact(String artifactName) {
        System.out.println("Перси записывает данные об артефакте: " + artifactName);
    }
}

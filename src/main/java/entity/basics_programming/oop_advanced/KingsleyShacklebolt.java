package entity.basics_programming.oop_advanced;

public class KingsleyShacklebolt implements Auror, ArtifactExpert {
    @Override
    public void studyArtifact(String artifactName) {
        System.out.println("Кингсли изучает артефакт: " + artifactName);
    }

    @Override
    public void catchDarkWizard() {
        System.out.println("Кингсли ловит тёмного мага!");
    }
}

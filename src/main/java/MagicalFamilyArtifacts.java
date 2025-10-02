public class MagicalFamilyArtifacts {
    public static void main(String[] args) {
        Artifact potter = new Artifact.PotterArtifact("Мантия-невидимка");
        Artifact malfoy = new Artifact.MalfoyArtifact("Змеиный жезл");

        potter.use();
        malfoy.use();
    }
}

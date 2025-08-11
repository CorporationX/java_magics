package entity.basics_programming.oop_advanced;

public class MagicalFamilyArtifacts {
    public static void main(String[] args) {
        Artifact potter = new PotterArtifact("Мантия-невидимка");
        Artifact malfoy = new MalfoyArtifact("Змеиный жезл");

        potter.use();
        malfoy.use();
    }
}

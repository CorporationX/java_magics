package entity.basics_programming.oop_advanced;

public class MinistryOfMagic {
    public static void main(String[] args) {
        KingsleyShacklebolt kingsley = new KingsleyShacklebolt();
        PercyWeasley percy = new PercyWeasley();

        kingsley.catchDarkWizard();
        kingsley.studyArtifact("Меч Гриффиндора");

        percy.studyArtifact("Меч Гриффиндора");
    }
}

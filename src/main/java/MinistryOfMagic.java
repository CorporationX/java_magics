public class MinistryOfMagic {
    public static void main(String[] args) {
        // Создаём объекты
        KingsleyShacklebolt kingsley = new KingsleyShacklebolt();
        PercyWeasley percy = new PercyWeasley();

        // Кингсли выполняет две роли
        kingsley.catchDarkWizard();
        kingsley.studyArtifact("Меч Гриффиндора");

        // Перси занимается только артефактами
        percy.studyArtifact("Меч Гриффиндора");
    }
}
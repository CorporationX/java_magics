public class PotionVesselMain {
    public static void main(String[] args) {
        Wand wandHermione = new Wand(27, "Сердцевина дракона", "Виноградная лоза");
        HogwartsStudent hermione = new HogwartsStudent("Гермиона", 17, wandHermione);
        PotionVessel potion1 = new PotionVessel("Оборотное зелье", 150.0, true, hermione);

        Wand wandRon = new Wand(35, "Волос единорога", "Ясень");
        HogwartsStudent ron = new HogwartsStudent("Рон", 17, wandRon);
        PotionVessel potion2 = new PotionVessel(50.0, ron);

        printPotionInfo(potion1);
        printPotionInfo(potion2);
    }

    public static void printPotionInfo(PotionVessel potion) {
        System.out.println("Сосуд: " + potion.potionName);
        System.out.println("Объём: " + potion.volume + " мл");
        System.out.println("Магическое: " + potion.isMagical);
        System.out.println("Принадлежит: " + potion.creator.name + "\n");
    }
}

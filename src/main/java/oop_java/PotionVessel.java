package oop_java;
// 18. Сосуд с зельем*
class PotionVessel {
    String potionName;
    double volume;
    boolean isMagical;
    HogwartsStudent creator;

    PotionVessel(String potionName, double volume, boolean isMagical, HogwartsStudent creator) {
        this.potionName = potionName;
        this.volume = volume;
        this.isMagical = isMagical;
        this.creator = creator;
    }
    PotionVessel(double volume, boolean isMagical, HogwartsStudent creator) {
        this.volume = volume;
        this.isMagical = false;
        this.creator = creator;
    }

    public static void main(String[] args) {
        HogwartsStudent germiona = new HogwartsStudent("Гермиона", 13);
        PotionVessel potionVessel1 = new PotionVessel("Оборотное зелье",
                150.00, false, germiona );
        System.out.println("Сосуд: " + potionVessel1.potionName + "\nОбъем: " + potionVessel1.volume + " мл" +
                "\nМагическое: " + potionVessel1.isMagical + "\nПринадлежит: " + potionVessel1.creator.name);

        HogwartsStudent drako = new HogwartsStudent("Драко", 12);
        PotionVessel potionVessel2 = new PotionVessel(50.0, false, drako);
        System.out.println("\nСосуд: Неизвестно" + "\nОбъем: " + potionVessel2.volume + "мл"
                + "\nМагическое: " + potionVessel2.isMagical + "\nПринадлежит: " + potionVessel2.creator.name);
    }
}

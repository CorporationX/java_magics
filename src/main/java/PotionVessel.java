public class PotionVessel {
    String potion;
    double volume;
    boolean isMagical;
    HogwartsStudent creator;

    public static void main(String[] args) {
        HogwartsStudent germiona = new HogwartsStudent("Гермиона", 14);
        HogwartsStudent drako = new HogwartsStudent("Драко", 14);

        PotionVessel potionGermiona = new PotionVessel("Оборотное зелье", 150, true, germiona);
        PotionVessel potionDrako = new PotionVessel(50, drako);

        dataOutput(potionGermiona);
        dataOutput(potionDrako);
    }

    // Конструктор со всеми параметрами
    public PotionVessel(String potion, double volume, boolean isMagical, HogwartsStudent creator) {
        this.potion = potion;
        this.volume = volume;
        this.isMagical = isMagical;
        this.creator = creator;
    }

    // Конструктор без названия зелья и с полем isMagical = false
    public PotionVessel(double volume, HogwartsStudent creator) {
        this.potion = "Неизвестно";
        this.volume = volume;
        this.creator = creator;
        this.isMagical = false;
    }

    // Метод, который печатает данные на экран
    public static void dataOutput(PotionVessel potionVessel) {
        System.out.println("Сосуд: " + potionVessel.potion
                + "\nОбъем: " + potionVessel.volume + " мл"
                + "\nМагическое: " + potionVessel.isMagical
                + "\nПринадлежит: " + potionVessel.creator.name + "\n");
    }
}

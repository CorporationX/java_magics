package entity.hogwarts.potion;

import entity.hogwarts.magic.HogwartsStudent;

public class PotionVessel {
    String potion;
    double volume;
    boolean isMagical;
    HogwartsStudent creator;

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
                + "\nПринадлежит: " + potionVessel.creator.getName() + "\n");
    }
}

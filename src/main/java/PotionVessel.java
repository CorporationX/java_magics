class PotionVessel {
    String potionName;
    double volume;
    boolean inMagical;
    HogwartsStudent creator;

    PotionVessel(String potionName, double volume, boolean inMagical, HogwartsStudent creator) {
        this.potionName = potionName;
        this.volume = volume;
        this.inMagical = inMagical;
        this.creator = creator;
    }
    PotionVessel(String potionName, double volume, HogwartsStudent creator) {
        this.potionName = "Неизвестно";
        this.volume = volume;
        this.inMagical = false;
        this.creator = creator;
    }
}
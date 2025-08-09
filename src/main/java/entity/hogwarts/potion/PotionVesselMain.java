package entity.hogwarts.potion;

import entity.hogwarts.magic.HogwartsStudent;

public class PotionVesselMain {
    public static void main(String[] args) {
        HogwartsStudent germiona = new HogwartsStudent("Гермиона", 14);
        HogwartsStudent drako = new HogwartsStudent("Драко", 14);

        PotionVessel potionGermiona = new PotionVessel("Оборотное зелье", 150, true, germiona);
        PotionVessel potionDrako = new PotionVessel(50, drako);

        PotionVessel.dataOutput(potionGermiona);
        PotionVessel.dataOutput(potionDrako);
    }
}

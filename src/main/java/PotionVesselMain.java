public class PotionVesselMain {
    public static void main(String[] args) {
        HogwartsStudent hermiona = new HogwartsStudent("Гермиона", 11);
        HogwartsStudent drako = new HogwartsStudent("Драко", 10);

        Wand harryWand = new Wand("Тис", "Волос единорога", 34);
        HogwartsStudent harry = new HogwartsStudent("Гарри Поттер", 12, harryWand);

        PotionVessel polyjuicePotion = new PotionVessel("Оборотное зелье", 200.0, true, hermiona);
        PotionVessel babblingBeveragePotion = new PotionVessel("Болтушка для молчунов", 150.0, true, drako);
        PotionVessel sugarWatter = new PotionVessel(500.0, harry);

        PotionVessel[] potionVessels = {polyjuicePotion, babblingBeveragePotion, sugarWatter};

        for ( PotionVessel vessel : potionVessels) {
            System.out.println("Сосуд: " + vessel.potionName);
            System.out.println("Объем: " + vessel.volume);
            System.out.println("Магическое: " + vessel.isMagical);
            System.out.println("Принадлежит: " + vessel.creator.name + "\n");

        }

    }
}

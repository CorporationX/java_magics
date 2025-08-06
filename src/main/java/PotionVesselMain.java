public class PotionVesselMain {
    public static void main(String[] args) {
       
        HogwartsStudent harry = new HogwartsStudent("harry", 19);
        HogwartsStudent ron = new HogwartsStudent("ron", 20);
        
        PotionVessel voda = new PotionVessel("voda", 500, true, harry);
        PotionVessel vodka = new PotionVessel(1000, ron);

        System.out.println("зелье: " + voda.potionName + "\n" + "Объем: " + voda.volume + " ml" + "\n"
                             + "Магическое: " + voda.isMagical + '\n' + "Срздатель: " + voda.creator.name + "\n");
        System.out.println("зелье: " + vodka.potionName + "\n" + "Объем: " + vodka.volume + " ml" + "\n"
                             + "Магическое: " + vodka.isMagical + '\n' + "Срздатель: " + vodka.creator.name);                             
    }
}

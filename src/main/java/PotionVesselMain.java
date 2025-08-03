public class PotionVesselMain {
    public static void main(String[] args) {
        HogwartsStudent hermione = new HogwartsStudent("Гермиона");
        PotionVessel hermioneVessel = new PotionVessel("Оборотное зелье", 150.0, true, hermione);
        System.out.println("Сосуд: " + hermioneVessel.potionName + "\nОбъём: " + hermioneVessel.volume +" мл" + "\nМагическое: " + hermioneVessel.inMagical +"\nПринадлежит: " + hermione.name);

        HogwartsStudent draco = new HogwartsStudent("Драко");
        PotionVessel dracoVessel = new PotionVessel("Неизвестно", 150.0, true, draco);
        System.out.println("Сосуд: " + dracoVessel.potionName + "\nОбъём: " + dracoVessel.volume +" мл" + "\nМагическое: " + dracoVessel.inMagical +"\nПринадлежит: " + draco.name);
    }
}

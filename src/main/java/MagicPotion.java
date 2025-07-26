public class MagicPotion {
    public static void main(String[] args) {
        String[] potion = new String[6];
        potion[0] = "Засушенная чешуя василиска";
        potion[1] = "Частичка души лесной феи";
        potion[2] = "Капля сока вампирской розы";
        potion[3] = "Яд шершавого ядозуба";
        potion[4] = "Осколок кометы";
        potion[5] = "Слеза феникса";

        for (String order :  potion) {
            System.out.println(order);
        }
    }
}

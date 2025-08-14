public class MagicPotion {
    public static void main(String[] args) {

        //Пустой котел
        String[] potion = new String[6];

        //Добавляем ингредиенты
        potion[2] = "Капля сока вампирской розы";
        potion[5] = "Слеза феникса";
        potion[0] = "Засушенная чешуя василиска";
        potion[1] = "Частичка души лесной феи";
        potion[3] = "Яд шершавого ядозуба";
        potion[4] = "Осколок кометы";

        // Результат
        for (String element : potion){
            System.out.println(element);
        }
    }
}

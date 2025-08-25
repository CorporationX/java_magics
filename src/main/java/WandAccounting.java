public class WandAccounting {
    public static void main(String[] args) {
        // Создаём студентов, которые покупают палочки
        MagicWand wand1 = new MagicWand("Гарри");
        MagicWand wand2 = new MagicWand("Гермиона");
        MagicWand wand3 = new MagicWand("Рон");

        // Показываем владельца первой палочки
        wand1.showOwner();

        // Показываем общее количество проданных палочек
        MagicWand.showTotalWandsSold();
    }
}
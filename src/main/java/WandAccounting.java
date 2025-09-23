public class WandAccounting {
    public static void main(String[] args) {
        MagicWand wand1 = new MagicWand("Гарри");
        MagicWand wand2 = new MagicWand("Гермиона");
        MagicWand wand3 = new MagicWand("Рон");

        // Показываем владельца первой палочки
        wand3.showOwner();

        // Показываем общее количество проданных палочек
        MagicWand.showTotalWandsSold();
    }
}

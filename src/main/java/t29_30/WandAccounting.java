package t29_30;

public class WandAccounting {
    public static void main(String[] args) {
        MagicWand.showTotalWandSold();

        MagicWand wand1 = new MagicWand("Гарри");
        MagicWand.showTotalWandSold();

        MagicWand wand2 = new MagicWand("Гермиона");
        MagicWand.showTotalWandSold();

        MagicWand wand3 = new MagicWand("Рон");
        MagicWand.showTotalWandSold();

        wand1.showOwner();
        wand3.showOwner();
        MagicWand.showTotalWandSold();
    }
}

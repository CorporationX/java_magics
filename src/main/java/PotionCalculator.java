public class PotionCalculator {
    //Расчет пиявок.
    static int calculateNeededSlugs(int numberOfPotions) {
        int forOnePotionSlug = 3;
        return numberOfPotions * forOnePotionSlug;
    }
    //Расчет водорослей.
    static int calculateNeededFluxweed(int numberOfPotions) {
        int forOnePotionFluxweed = 2;
        return numberOfPotions * forOnePotionFluxweed;
    }
    //Состав этикетки.
    static String getPotionLabel(String potionName, int numberOfPotions, int totalSlugs, int totalFluxweed) {
        String label = "Этикетка: " + potionName + ": Расчет для  " + numberOfPotions + " порций." + " Состав : Пиявок - " + totalSlugs + ", Водоросли - " + totalFluxweed + ".";
        return label;
    }
}

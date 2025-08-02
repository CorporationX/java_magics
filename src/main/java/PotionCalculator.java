public class PotionCalculator {
    int calculateNeededSlugs(int numberOfPotions) {
        return numberOfPotions * 3;
    }

    int calculateNeededFluxweed(int numberOfPotions) {
        return numberOfPotions * 2;
    }

    String getPotionLabel(String potionName, int numberOfPotions, int totalSlugs, int totalFluxweed) {
        String label = "Этикетка: " + potionName + " (" + numberOfPotions + " порций). "
                + "Состав: Пиявки - " + totalSlugs + ", Водоросли - " + totalFluxweed + ".";
        return label;
    }
}

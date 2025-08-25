public class PotionCalculator {
    int calculateNeededSlugs(int numberOfPotions) {
        int slugsPerPotion = 3;
        return numberOfPotions * slugsPerPotion;
    }

    int calculateNeededFluxweed(int numberOfPotions) {
        int fluxweedPerPotion = 2;
        return numberOfPotions * fluxweedPerPotion;
    }

    String getPotionLabel(String potionName, int numberOfPotions, int totalSlugs, int totalFluxweed) {
        String label = "Этикетка: " + potionName + " (" + numberOfPotions + " порций). "
                       + "Состав: Пиявки - " + totalSlugs + ", Водоросли - " + totalFluxweed + ".";
        return label;
    }
}

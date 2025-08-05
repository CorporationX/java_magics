public class PotionCalculator {
    int calculateNeededSlugs(int numberOfPotions) {
        final int slugsPerPotion = 3;
        return numberOfPotions * slugsPerPotion;
    }

    int calcculateNeededFluxweed(int numberOfPotions) {
        final int fluxweedPerPotion = 2;
        return numberOfPotions * fluxweedPerPotion;
    }

    String getPotionLabel(String potionName, int numberOfPotions, int totalSlugs, int totalFluxweed) {
        String label = potionName + " (" + numberOfPotions + " порций). " +
                "Состав: Пиявки - " + totalSlugs + ", Водоросли - " + totalFluxweed + ".";
        return label;
    }
}

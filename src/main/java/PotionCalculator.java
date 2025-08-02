public class PotionCalculator {
    int calculateNeededSlugs(int numberOfPotions) {
        int totalSlugs = numberOfPotions * 3;
        return totalSlugs;
    }

    int calculateNeededFluxweed(int numberOfPotions) {
        int totalFluxweed = numberOfPotions * 2;
        return totalFluxweed;
    }

    String getPotionLabel(String potionName, int numberOfPotions, int totalSlugs, int totalFluxweed) {
//        Этикетка: Оборотное зелье (15 порций). Состав: Пиявки - 45, Водоросли - 30.
        String label = "Этикетка: " + potionName + " (" + numberOfPotions + " порций). Состав: Пиявки - " + totalSlugs
                + ", Водоросли - " + totalFluxweed;
        return label;
    }
}

public class PotionCalculator {
    int calculateNeededSlugs(int numberOfPotions) {
        int slugsPerPotion = 3;
        return slugsPerPotion * numberOfPotions;
    }

    int calculateNeededFluxweed(int numberOfPotions) {
        int totfluxweedPerPotion = 2;
        return totfluxweedPerPotion * numberOfPotions;
    }

    String getPotionLabel(String potionName, int numberOfPotions, int totalSlugs, int totalFluxweed) {
//        Этикетка: Оборотное зелье (15 порций). Состав: Пиявки - 45, Водоросли - 30.
        String label = "Этикетка: " + potionName
                + " (" + numberOfPotions + " порций). "
                + "Состав: Пиявки - " + totalSlugs
                + ", Водоросли - " + totalFluxweed;
        return label;
    }
}

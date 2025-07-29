public class ForbiddenForest {
    public static void main(String[] args) {
        boolean hasWand = true;
        int magicPower = 96;
        boolean hasPotionInvisibility = false;
        boolean hasHagridArt = false;

        if (hasWand && magicPower > 80) {
            System.out.println("Сможете пройти!");
        } else if (magicPower >= 50 && hasPotionInvisibility) {
            System.out.println("Сможете пройти!");
        } else if (magicPower < 50 && hasHagridArt) {
            System.out.println("Сможете пройти!");
        } else {
            System.out.println("НЕ сможете пройти!");
        }

        if (magicPower > 95 && hasWand) {
            System.out.println("Можете взять с собой друга!");
        }
    }
}

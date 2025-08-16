public class ForbiddenForest {
    public static void main(String[] args) {

        int magicPower = 113;
        boolean hasWand = true;
        boolean hasPotion = true;
        boolean hasArtifact = true;

        if (magicPower > 80 && hasWand) {
            System.out.println("Вы можете пройти сквозь защитные чары!");
        }
        else if (magicPower >= 50 && hasWand && hasPotion) {
            System.out.println("Вы можете пройти сквозь защитные чары!");
        }
        else if (magicPower < 50 && hasWand && hasArtifact) {
            System.out.println("Вы можете пройти сквозь защитные чары!");
        }
        else {
            System.out.println("Вы не сможете продолжить путь!");
        }

        if (magicPower > 95 && hasWand) {
            System.out.println("Можно даже с обузой)0))");
        }
    }
}

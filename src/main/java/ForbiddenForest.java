public class ForbiddenForest {
    public static void main(String[] args) {
        // Данные
        int magicPower = 70; //Магическая сила.
        boolean hasWand = true; //Есть ли палочка.
        boolean hasPotion = true; //Есть ли зелье невидимости.
        boolean hasArtifact = false; //Есть ли артефакт Хагрида.

        // Проверяем соблюдение условий
        if (magicPower > 80 && hasWand) {
            System.out.println("Вы прошли через магический барьер!");
        } else if (magicPower >= 50 && hasPotion) {
            System.out.println("Вы прошли через магический барьер, используя зелье!");
        } else if (magicPower < 50 && hasArtifact) {
            System.out.println("Вы воспользовались артефактом и прошли через барьер!");
        } else {
            System.out.println("Вы не прошли магический барьер!");
        }

            // дополнительное испытание
            if (magicPower > 95 && hasWand) {
                System.out.println("Вы взяли с собой друга!");
            }
    }
}

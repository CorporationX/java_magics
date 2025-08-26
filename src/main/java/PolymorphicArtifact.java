import java.util.Random;

public class PolymorphicArtifact {
     public static void main(String[] args) {
        Wizard[] wizards = {new Dumbledore(), new Snape(), new Peeves()};
        Random random = new Random();

        Wizard chosenOne = wizards[random.nextInt(wizards.length)];
        System.out.println("Перед нами маг! Кто это?");

        if (chosenOne instanceof Dumbledore) {
            System.out.println("Это Дамблдор. Он мудро улыбается.");
        } else if (chosenOne instanceof Snape) {
            System.out.println("Это профессор Снейп. Он смотрит с презрением.");
        } else if (chosenOne instanceof Peeves) {
            System.out.println("Это Пивз. Он не собирается подчиняться.");
        }

        chosenOne.castSpell();
    }
}

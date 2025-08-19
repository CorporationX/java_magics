package t38_39;

import java.util.Random;

public class PolymorphicArtifact {
    public static void main(String[] args) {
        Random random = new Random();
        Wizard[] wizards = {
                new Dumbledore(),
                new Snape(),
                new Peeves(),
        };

        int randomWizard = random.nextInt(wizards.length);

        Wizard chooseOne = wizards[randomWizard];
        System.out.println("Перед нами маг! Кто это?");

        if (chooseOne instanceof Dumbledore) {
            System.out.println("Это Дамблдор. Он мудро улыбается.");
        } else if (chooseOne instanceof Snape){
            System.out.println("Это профессор Снейп. Он смотрит с презрением.");
        } else {
            System.out.println("Это Пивз. Он не собирается подчиняться.");
        }
        chooseOne.castSpell();
    }
}

package entity.basics_programming.oop_advanced.task39;

import java.util.Random;

public class PolymorphicArtifact {
    public static void main(String[] args) {
        Wizard[] wizards = {
                new Dumbledore(),
                new Snape(),
                new Peeves()
        };

        print(wizards);
    }

    public static void print(Wizard[] wizard) {
        Random random = new Random();
        Wizard chosenOne = wizard[random.nextInt(wizard.length)];
        System.out.println("Перед нами маг! Кто это?");

        if (chosenOne instanceof Dumbledore) {
            System.out.println("Это Дамблдор. Он мудро улыбается.");
        } else if (chosenOne instanceof Snape) {
            System.out.println("Это профессор Снейп. Он смотрит с презрением.");
        } else {
            System.out.println("Это Пивз. Он не собирается подчиняться.");
        }

        chosenOne.castSpell();
    }
}



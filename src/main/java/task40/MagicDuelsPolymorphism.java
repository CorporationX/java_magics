package task40;

import java.util.Random;

public class MagicDuelsPolymorphism {
    public static void main(String[] args) {

        Wizard[] wizards = {
                new Professor("МакГонагалл"),
                new Student("Гарри Поттер"),
                new DarkWizard("Волан-де-Морт"),
                new Professor("Дамблдор"),
                new Student("Рон"),
                new Professor("Снегг"),
                new Student("Гермиона"),
        };

        String[] spells = {
                "Expelliarmus",
                "Lumos",
                Wizard.AVADAKEDAVRA
        };

        Random random = new Random();
        String randomSpell;

        System.out.println("\nВсе дуэлянты стреляют по очереди::");
        for (Wizard wizard : wizards) {
            randomSpell = spells[random.nextInt(3)];
            wizard.castSpell(randomSpell);
            if (wizard instanceof DarkWizard && randomSpell.equals(Wizard.AVADAKEDAVRA)) {
                System.out.println("Это запрещённое заклинание! Дуэль прекращается!");
                break;
            }
        }

        System.out.println("\n10 случайных дуэлянтов и случайных заклинаний:");
        int n = 10;
        Wizard randomWizard;
        for (int i = 1; i <= n; i++) {
            randomSpell = spells[random.nextInt(3)];
            randomWizard = wizards[random.nextInt(wizards.length-1)];
            randomWizard.castSpell(randomSpell);
            if (randomWizard instanceof DarkWizard && randomSpell.equals(Wizard.AVADAKEDAVRA)) {
                System.out.println("Это запрещённое заклинание! Дуэль прекращается!");
                break;
            }
        }
    }
}

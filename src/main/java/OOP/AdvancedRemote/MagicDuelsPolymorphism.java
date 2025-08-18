package OOP.AdvancedRemote;

import java.util.Random;

public class MagicDuelsPolymorphism {
    public static void main(String[] args) {
        Wizard[] duelists = {
                new Student("Гарри Поттер"),
                new Professor("Макгонагалл"),
                new DarkWizard("Волан-де-Морт")
        };
        String[] spells = {"Expelliarmus", "Lumos", "Авада Кедавра"};

        Random random = new Random();

        for (Wizard wizard : duelists) {
            String randomSpell = spells[random.nextInt(spells.length)];
            wizard.castSpell(randomSpell);
        }

        // Дополнительное задание
        System.out.println("\nСлучайные дуэли");
        int n = 10; // Количество дуэлей
        for (int i = 0; i < n; i++) {
            // Выбираем случайного мага
            Wizard randomWizard = duelists[random.nextInt(duelists.length)];
            // Выбираем случайное заклинание
            String randomSpell = spells[random.nextInt(spells.length)];
            randomWizard.castSpell(randomSpell);
        }
    }
}

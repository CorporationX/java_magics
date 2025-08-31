import java.util.Random;

public class MagicDuelsPolymorphism {
    public static void main(String[] args) {
        Wizard[] duelists = {
                new Student("Гарри Поттер"),
                new Professor("Профессор МакГонагалл"),
                new DarkWizard("Воланд-де-Морт"),
        };

        String[] spells = {"Expelliarmus", "Lumos", "Avada Kedavra"};

        System.out.println("Магическая дуэль начинается!");

        Random rand = new Random();

         int rounds = 2;
        for (int r = 0; r < rounds; r++) {
            for (Wizard wizard : duelists) {
                String spell = spells[rand.nextInt(spells.length)];
                boolean continueDuel = wizard.castSpell(spell);
                if (!continueDuel) {
                    // дуэль немедленно прекращается
                    return;
                }
            }
        }

        System.out.println("Дуэль окончена.");
    }
}
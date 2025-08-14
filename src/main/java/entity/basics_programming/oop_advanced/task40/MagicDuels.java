package entity.basics_programming.oop_advanced.task40;

import java.util.Random;

class MagicDuels {

    public static void duels(Wizard[] duelists, String[] spell) {
        Random rand = new Random();

        int countsOfPosition = 10; // количество позиций
        int i = 0; // итератор цикла

        while (i < countsOfPosition) {
            int currentSpell = rand.nextInt(spell.length);
            int currentWizard = rand.nextInt(duelists.length);

            if (duelists[currentWizard] instanceof Student) {
                if (spell[currentSpell].equals("Avada Kedavra")) {
                    System.out.println("Это запрещённое заклинание! Дуэль прекращается!");
                    break;
                } else {
                    duelists[currentWizard].castSpell(spell[currentSpell]);
                }
            } else {
                duelists[currentWizard].castSpell(spell[currentSpell]);
            }
            i++;
        }
    }
}
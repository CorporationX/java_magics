package entity.basics_programming.exceptions.task47;

import java.util.Random;

public class ArtifactEnchanter {

    private static void gatherMagicEnergy(boolean sourceAvailable) throws MagicEnergySourceEmptyException {
        if (sourceAvailable) {
            System.out.println("Энергия собрана");
        } else {
            throw new MagicEnergySourceEmptyException("Зарядка энергии провалилась. Источника магии не хватило");
        }
    }

    private static void chargeRune(boolean runeIntact) throws MagicEnergySourceEmptyException, RuneCrackedException {
        Random charge = new Random(); // создали вероятность для сбора энергии
        gatherMagicEnergy(charge.nextInt(101) > 30);
        if (runeIntact) {
            System.out.println("Руна заряжена");
        } else {
            throw new RuneCrackedException("Зарядка руны не удалась. Руна треснула");
        }
    }

    public static void applyEnchantment() throws MagicEnergySourceEmptyException, RuneCrackedException, EnchantmentRejectedException {
        Random charge = new Random();
        chargeRune(charge.nextInt(101) > 50); // создали вероятность для зарядки руны

        boolean artifactReceptive = charge.nextInt(101) > 70; // создали вероятность для зачарования магией

        if (artifactReceptive) {
            System.out.println("Зачарование наложено!");
        } else {
            throw new EnchantmentRejectedException("Зачарование провалилось. Заклинание не принято");
        }
    }
}

package task47;

public class ArtifactEnchanter {
    public static void gatherMagicEnergy(boolean sourceAvailable) throws MagicEnergySourceEmptyException{
        if (sourceAvailable) {
            System.out.println("Энергия собрана");
        } else {
            throw new MagicEnergySourceEmptyException("Ошибка. Не хватает энергии");
        }
    }

    public static void chargeRune(boolean runeIntact) throws RuneCrackedException, MagicEnergySourceEmptyException {
        gatherMagicEnergy(true);
        if (runeIntact) {
            System.out.println("Руна заряжена");
        } else {
            throw new RuneCrackedException("Ошибка. Руна сломана.");
        }
    }

    public static void applyEnchantment(boolean artifactReceptive) throws
            EnchantmentRejectedException, RuneCrackedException, MagicEnergySourceEmptyException {
        chargeRune(true);
        if (artifactReceptive) {
            System.out.println("Зачарование наложено!");
        } else {
            throw new EnchantmentRejectedException("Ошибка. Отказ: чары отклонены");
        }
    }

    public static void main(String[] args) {
        try {
            applyEnchantment(true);
        } catch (EnchantmentRejectedException | RuneCrackedException | MagicEnergySourceEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}

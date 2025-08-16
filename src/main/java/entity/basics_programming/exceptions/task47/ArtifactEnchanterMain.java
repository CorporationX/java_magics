package entity.basics_programming.exceptions.task47;

import static entity.basics_programming.exceptions.task47.ArtifactEnchanter.applyEnchantment;

public class ArtifactEnchanterMain {
    public static void main(String[] args) throws EnchantmentRejectedException, MagicEnergySourceEmptyException, RuneCrackedException {
        // В методах реализовал вероятности изготовления артефакта с уменьшением вероятности к последнему вызову
        // прогнал 10 попыток через массив для наглядности
        // изменил вызов applyEnchantment(boolean artifactReceptive),
        // чтобы генерировать вероятность внутри метода случайным образом
        for (int step = 0; step < 10; step++) {
            try {
                applyEnchantment();
            } catch (EnchantmentRejectedException e) {
                System.out.println(e.getMessage());
            } catch (RuneCrackedException e) {
                System.out.println(e.getMessage());
            } catch (MagicEnergySourceEmptyException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Приступим к следующей попытке\n");
            }
        }
    }
}

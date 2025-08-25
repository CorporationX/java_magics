public class MagicCreature {
    private String name;
    private int power;

    private static int count = 0;
    private static int maxPower = 0;

    public MagicCreature(String name, int power) {
        this.name = name;
        this.power = power;
        count++;
        if (power > maxPower) {
            maxPower = power;
        }
    }

    public static void printStatistics() {
        System.out.println("Создано существ:" + count);
        System.out.println("Максимальная сила:" + maxPower);
    }
}

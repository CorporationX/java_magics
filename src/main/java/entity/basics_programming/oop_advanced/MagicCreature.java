package entity.basics_programming.oop_advanced;

public class MagicCreature {
    private String name;             // Имя существа
    private int power = 0;           // Сила существа
    private static int count = 0;    // Количество созданных существ
    private static int maxPower = 0; // Сила самого сильного существа

    public MagicCreature(String name, int power) {
        this.name = name;
        this.power = power;
        count++;
        if (this.power > maxPower) {
            maxPower = power;
        }
    }

    public static void printStatistics() {
        System.out.println("Созданно существ: " + MagicCreature.count
                + "\nМаксимальная сила: " + maxPower);
    }
}

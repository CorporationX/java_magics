public class MagicCreature2 {
    private final String name;
    private final int power;
    static int count = 0;
    static int maxPower = 0;

    public MagicCreature2(String name, int power) {
        this.name = name;
        this.power = power;
        count++;

        if (power > maxPower) {
            maxPower = power;
        }
    }

    // Геттеры для привыкания просто)
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public static int getCount() {
        return count;
    }

    public static int getMaxPower() {
        return maxPower;
    }

    // Можно его сделать статическим и вызывать через класс
    static void printStatistics() {
        System.out.println("Создано существ: " + getCount());
        System.out.println("Максимальная сила: " + getMaxPower());
    }

    // Но хорошая логика будет если написать метод нестатичный для отдельных существ, например:
    void printInfoCreature() {
        System.out.println("\nИмя существа: " + getName());
        System.out.println("Сила существа: " + getPower());
    }
}

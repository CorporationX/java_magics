package task31;

public class MagicCreature {
    private String name;
    private int power;
    private static int count = 0;
    private static int maxPower = 0;

    // Дополнительно сохраним имя существа с максимальной силой.
    private static String maxPowerName = "";

    public MagicCreature(String name, int power) {
        if (name.isBlank() ) {
            // не используем проверку на name.isEmpty(), т.к.
            // name.isEmpty() является подмножеством name.isBlank()
            System.out.println("Вы ввели некорретное имя. Присвоено имя \"Безымянный\" ");
            this.name = "Безымянный";
        } else {
            this.name = name;
        }
        count++;
        // count++ Вынесено из блока if, потому что объект в любом случае создаться
        // независимо от имени (корретное/некорректное)

        // Дефолтное значение силы = 0, учитывается в условии (power <1)
        if (power <1 ) {
            String message = String.format("Сила должна быть положительным числом. " +
                    "Для существа %s установлена сила: 1 \n", this.name);
            System.out.println(message);
            this.power = 1;
        } else {
            this.power = power;
        }

        if (this.power > maxPower) {
            maxPower = this.power;
            maxPowerName = this.name;
        }
    }

    public static void printStatistics() {
        System.out.println("Статистика по существам: " + "\n");
        System.out.println("Создано существ: " + MagicCreature.count);
        System.out.println("Максимальная сила: " + MagicCreature.maxPower);
        System.out.println("Обладатель максимальной силы: " + MagicCreature.maxPowerName);
    }
}

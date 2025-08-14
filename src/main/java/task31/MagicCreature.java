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
            System.out.println("Задайте корректное имя (не пустое и не состоящее только из пробельных символов)");
            return;
            // Вопрос: можно ли таким образом прервать действие конструктора, если введены некорректные данные?
        } else {
            this.name = name;
            count++;
        }

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

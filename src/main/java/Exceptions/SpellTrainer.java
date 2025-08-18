package Exceptions;

public class SpellTrainer {
    public static void main(String[] args) {
        String[] spells = {"Expelliarmus", "Avada Kedavra", "Lumos", "Perceptio Recupero"};

        for (String spell : spells) {
            try {
                castSpell(spell);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка обезоруживания: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Общая магическая ошибка: " + e.getMessage());
            }

            System.out.println(); // пустая строка для разделения
        }
    }

    public static void castSpell(String spellName) {
        System.out.println("Начинаем произносить заклинание: " + spellName);

        try {
            switch (spellName) {
                case "Expelliarmus" ->
                    // ещё не прошли, но я посмотрел про исключения статью, без throw нам не выкинуть исключение
                        throw new IllegalArgumentException("Заклинание обезоруживания дало сбой");
                case "Lumos" -> System.out.println("Заклинание успешно выполнено");
                default -> throw new RuntimeException("Заклинание запрещено!");
            }
        } finally {
            System.out.println("Закрываем поток магической энергии");
        }
    }
}

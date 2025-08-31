public class SpellTrainer {

    public static void castSpell(String spellName) {
        try {
            System.out.println("Начинаем произносить заклинание: " + spellName);

            if ("Expelliarmus".equals(spellName)) {
                throw new IllegalArgumentException("Заклинание обезоруживания дало сбой");
            } else if ("Avada Kedavra".equals(spellName)) {
                throw new RuntimeException("Заклинание запрещено!");
            } else if ("Lumos".equals(spellName)) {
                System.out.println("Заклинание успешно выполнено");
            } else {
                throw new RuntimeException("Заклинание запрещено!");
            }
        } finally {
            System.out.println("Закрываем поток магической энергии");
        }
    }

    public static void main(String[] args) {
                try {
            castSpell("Expelliarmus");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка обезоруживания: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая магическая ошибка: " + e.getMessage());
        }

                try {
            castSpell("Avada Kedavra");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка обезоруживания: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая магическая ошибка: " + e.getMessage());
        }

                try {
            castSpell("Lumos");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка обезоруживания: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая магическая ошибка: " + e.getMessage());
        }

        try {
            castSpell("Perceptio Recupero");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка обезоруживания: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая магическая ошибка: " + e.getMessage());
        }
    }
}

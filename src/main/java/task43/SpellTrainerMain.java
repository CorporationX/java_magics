package task43;

public class SpellTrainerMain {
    public static void main(String[] args) {
        String spellName = "Expelliarmus";
        // String spellName = "Avada Kedavra";
        // String spellName = "Lumos";
        // String spellName = "Perceptio Recupero";
        // String spellName = "";
        SpellTrainer spellTrainer = new SpellTrainer();

        try {
            spellTrainer.castSpell(spellName);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка обезоруживания: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая магическая ошибка: " + e.getMessage());
        } finally {
            System.out.println("Закрываем поток магической энергии");
        }
    }
}

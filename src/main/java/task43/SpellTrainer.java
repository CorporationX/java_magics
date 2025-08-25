package task43;

public class SpellTrainer {
    public void castSpell(String spellName) throws IllegalArgumentException {
        System.out.println("Начинаем произносить заклинание: " + spellName);
        switch (spellName) {
            case "Expelliarmus" -> throw new IllegalArgumentException("Заклинание обезоруживания дало сбой");
            case "Avada Kedavra" -> throw new RuntimeException("Заклинание запрещено!");
            case "Lumos" -> System.out.println("Заклинание успешно выполнено");
            default -> throw new RuntimeException("Запрещенное заклинание!!!");
        }
    }
}

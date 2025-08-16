package entity.basics_programming.exceptions;

public class Duels {
    private static boolean isSpellSuccess = false;

    public static void castSpell(String spell) throws NoEffectSpellException, IllegalArgumentException {
        setSpellSuccess(false);
        if (spell == null || spell.isEmpty()) {
            throw new NullPointerException("Дуэлянт забыл заклинание");
        }
        System.out.println("Он использует заклинание \"" + spell + "\"");
        if (spell.length() < 5) {
            throw new NoEffectSpellException("Заклинание оказалось бесполезным!");
        }
        if (spell.length() > 12) {
            throw new IllegalArgumentException("Слишком мощное заклинание!");
        }
        System.out.println("Заклинание \"" + spell + "\" прошло успешно!");
        setSpellSuccess(true);
    }

    public static boolean isSpellSuccess() {
        return isSpellSuccess;
    }

    private static void setSpellSuccess(boolean spellSuccess) {
        isSpellSuccess = spellSuccess;
    }
}

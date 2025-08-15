package task28;

public class SpellChangesEverything {
    public static void main(String[] args) {
        castSpell();
    }

    public static void castSpell() {
        String spell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";

        String lowerSpell = spell.toLowerCase();
        String halfLowerSpell = lowerSpell.substring(lowerSpell.length() / 2);

        StringBuilder builderSpell = new StringBuilder(halfLowerSpell);
        builderSpell.reverse();

        builderSpell.replace(0,2, "! ");

        System.out.println("Итоговая строка: " + builderSpell.toString());
    }
}

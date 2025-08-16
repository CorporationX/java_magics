import java.util.Locale;

public class SpellChangesEverything {
    public static void main(String[] args) {
        String spell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";

        String spellLowerCase = spell.toLowerCase(Locale.ROOT);
        String halfSpell = spellLowerCase.substring(spellLowerCase.length() / 2);
        StringBuilder builder = new StringBuilder(halfSpell);
        builder.reverse();
        builder.setCharAt(0, '!');
        builder.setCharAt(1,' ');

        System.out.println(builder.toString());
    }
}

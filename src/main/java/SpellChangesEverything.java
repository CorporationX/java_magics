import java.util.Locale;

public class SpellChangesEverything {
    public static void main(String[] args) {
        String spell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";

        String spellLowerCase = spell.toLowerCase();
        String halfSpell = spellLowerCase.substring(spellLowerCase.length() / 2);
        StringBuilder builder = new StringBuilder(halfSpell);
        builder.replace(0,2, "! ");

        System.out.println(builder.toString());
    }
}

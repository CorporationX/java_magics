public class SpellChangesEverything {
    public static void main(String[] args) {
        castSpell();
    }

    public static void castSpell() {
        String text = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String lowerCaseSpell = text.toLowerCase();
        String halfSpell = lowerCaseSpell.substring(lowerCaseSpell.length() / 2);
        StringBuilder sb = new StringBuilder(halfSpell);
        sb.reverse();
        sb.setCharAt(0, '!');
        sb.setCharAt(1, ' ');

        System.out.println(sb.toString());
    }
}

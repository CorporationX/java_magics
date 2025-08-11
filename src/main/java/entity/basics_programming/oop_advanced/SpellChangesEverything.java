package entity.basics_programming.oop_advanced;

public class SpellChangesEverything {
    public static void main(String[] args) {
        castSpell();
    }

    public static void castSpell() {
        String startString = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String stringLowerCase = startString.toLowerCase();

        //Получиаем подстроку с индексом, равным длине строки, деленной на 2.
        String indexLengthDividedTwo = stringLowerCase.substring(stringLowerCase.length() / 2);

        StringBuilder builder = new StringBuilder(indexLengthDividedTwo);
        builder.reverse();

        //Заменяем первый символ строки на символ "!", а второй символ на пробел " ".
        builder.replace(0, 2, "! ");

        System.out.println(builder);
    }
}

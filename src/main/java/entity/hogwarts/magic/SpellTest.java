package entity.hogwarts.magic;

public class SpellTest {
    public static void main(String[] args) {
        String spell1 = new String("Expecto Patronum");
        String spell2 = "Expecto Patronum";

        if (spell1.equals(spell2)) {
            System.out.println("Оба заклинания одинаковые!");
        } else {
            System.out.println("Заклинания разные...");
        }

        StringBuilder incantation = new StringBuilder("Lumos");
        incantation.append(" Maxima");

        System.out.println(incantation.toString());
    }
}

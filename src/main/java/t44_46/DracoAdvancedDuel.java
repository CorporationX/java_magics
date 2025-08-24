package t44_46;

import java.util.Random;
import java.util.SortedMap;

public class DracoAdvancedDuel {
    public static void main(String[] args) {
        String[] dracoSpells = {"Expelliarmusus", null, "Crucio", "Lumos", "Incarcerous", "Silencio", "Redo"};
        String[] opponentSpells = {"Stupefy", "Avada Kedavra", null, "Accio", "Alohomora", "Reducto", "Lumo"};


        Random random = new Random();



        int dracoPoints = 0 ;
        int opponentPoints = 0;

        for (int i = 1; i <= 10; i++) {
            try {
                int randomSpellNum = random.nextInt(8);
                String randomSpell =dracoSpells[randomSpellNum];
                if (randomSpell.length() < 5)  {
                   throw new NoEffectSpellException("Заклинание оказалось бесполезным!" + randomSpell);
                } else if ( randomSpell.length() > 12 ) {
                    throw new IllegalArgumentException("Слишком мощное заклинание!" + randomSpell);
                }
                System.out.println("Драко проводит заклинание " + randomSpell);
                dracoPoints++;

            } catch (NoEffectSpellException | IllegalArgumentException e ) {
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Драко забыл заклинание");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Драко пытается сотворить несуществующее заклинание!");
            }

            try {
                int randomSpellNum = random.nextInt(8);
                String randomSpell =opponentSpells[randomSpellNum];
                if (randomSpell.length() < 5)  {
                    throw new NoEffectSpellException("Заклинание оппонента оказалось бесполезным!" + randomSpell);
                } else if ( randomSpell.length() > 12 ) {
                    throw new IllegalArgumentException("Слишком мощное заклинание оппонента!" + randomSpell);
                }
                System.out.println("Оппонент проводит заклинание " + randomSpell);
                opponentPoints++;

            } catch (NoEffectSpellException | IllegalArgumentException e ) {
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Оппонент забыл заклинание");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Оппонент пытается сотворить несуществующее заклинание!");
            }
        }

        System.out.printf("Драко неабрал %d очков%n", dracoPoints);
        System.out.printf("Оппонент неабрал %d очков%n", opponentPoints);

    }
}

package entity.basics_programming.exceptions;

import java.util.Random;

import static entity.basics_programming.exceptions.Duels.castSpell;

public class DracoAdvancedDuel {
    public static void main(String[] args) {
        // заклинания Драко
        String[] dracoSpells = {"Expelliarmus", "Reducto", "Brahiabindo", null,
                "Serpensortia", null, "Fiendfyre", "Duro"};

        // заклинания соперника
        String[] opponentSpells = {null, "Aqua Eructo", "Aguamenty", "Alarte Ascendare",
                null, "Bombarda", null, "Duro"};

        Random random = new Random();
        int currentSpellDraco = 0;
        int currentSpellOpponent = 0;
        int dracoScore = 0;
        int opponentScore = 0;

        int countOfDuels = 10;
        for (int i = 0; i < countOfDuels; i++) {
            System.out.println("\nАтакует Драко. ");
            currentSpellDraco = random.nextInt(10); // может выйти за границы
            try {
                castSpell(dracoSpells[currentSpellDraco]);
            } catch (NullPointerException e) { // дуэлянт забыл заклинание
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) { // дуэлянт пытается вспомнить несуществующее заклинание
                System.out.println("Дуэлянт пытается вспомнить несуществующее заклинание");
            } catch (IllegalArgumentException e) {  // заклинание слишком мощное
                System.out.println(e.getMessage());
            } catch (NoEffectSpellException e) { // заклинание бесполезное
                System.out.println(e.getMessage());
            }
            if (Duels.isSpellSuccess()) dracoScore++;

            // атака оппонента
            System.out.println("\nАтакует Оппонент. ");
            currentSpellOpponent = random.nextInt(10); // может выйти за границы
            try {
                castSpell(opponentSpells[currentSpellOpponent]);
            } catch (NullPointerException e) { // дуэлянт забыл заклинание
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) { // дуэлянт пытается вспомнить несуществующее заклинание
                System.out.println("Дуэлянт пытается вспомнить несуществующее заклинание");
            } catch (IllegalArgumentException e) {  // заклинание слишком мощное
                System.out.println(e.getMessage());
            } catch (NoEffectSpellException e) { // заклинание бесполезное
                System.out.println(e.getMessage());
            }
            if (Duels.isSpellSuccess()) opponentScore++;
        }
        System.out.println("\nОчки Драко: " + dracoScore + "\n"
                + "Очки оппонента: " + opponentScore);
        String result = dracoScore > opponentScore ? "победил Драко" :
                (dracoScore == opponentScore ? "ничья" : "победил оппонент");
        System.out.println(result);
    }
}


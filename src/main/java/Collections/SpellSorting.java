package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpellSorting {
    public static void main(String[] args) {
        String[] spellArray = {"Экспеллиармус", "Протего", "Ступефи"};
        List<String> spells = Arrays.asList(spellArray);
        Collections.sort(spells);
        System.out.println("Отсортированные заклинания: " + spells);

        String spellIndex = "Экспеллиармус";
        int index = Collections.binarySearch(spells, spellIndex);
        System.out.println(spellIndex + " найден на позиции " + index);
    }
}

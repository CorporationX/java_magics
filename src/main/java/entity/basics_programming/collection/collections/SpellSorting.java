package entity.basics_programming.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpellSorting {
    static void main() {
        // 1️⃣ В методе main класса SpellSorting создайте List,
        // добавьте в него несколько заклинаний в произвольном порядке.
        List<String> spells = new ArrayList<>();
        spells.add("Экспеллиармус");
        spells.add("Империус");
        spells.add("Протего");
        spells.add("Авада Кедавра");

        System.out.println("Начальная коллекция заклинаний: \n" + spells);

        // 2️⃣ Используйте Collections.sort(), чтобы отсортировать список.
        Collections.sort(spells);
        System.out.println("\nОтсортированные заклинания: \n" + spells);

        // 3️⃣ Используйте Collections.binarySearch() для быстрого поиска заданного заклинания.
        System.out.println("\nЭкспеллиармус найден на позиции: "
                + Collections.binarySearch(spells, "Экспеллиармус"));
        // 4️⃣ Выведите отсортированный список и позицию найденного заклинания.
    }
}

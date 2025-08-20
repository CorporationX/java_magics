package entity.basics_programming.collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class theory {
    static void main() {
        // 💫Collections.copy()
        System.out.println("  \uD83D\uDCABCollections.copy()");

        // Исходный список
        List<String> originalList = List.of("Мантия-невидимка", "Философский камень", "Бузинная палочка");

        // Создаем список-назначение ТОЧНО такого же размера, заполненный null
        // 1. new String[originalList.size()] -> создает массив String[] нужного размера [null, null, null]
        // 2. Arrays.asList(...) -> превращает массив в List<String> фиксированного размера
        // 3. new ArrayList<>(...) -> создает ИЗМЕНЯЕМЫЙ ArrayList, копируя null'ы из списка п.2
        List<String> backupList = new ArrayList<>(Arrays.asList(new String[originalList.size()]));

        System.out.println("Список-назначение до копирования: " + backupList);

        // Теперь можно копировать!
        Collections.copy(backupList, originalList); // Копируем из originalList В backupList

        System.out.println("Список-назначение ПОСЛЕ копирования: " + backupList);


        // 💫 Мгновенное Создание Коллекций: List.of(), Set.of(), Map.of()
        System.out.println("\n\n  \uD83D\uDCAB Мгновенное Создание Коллекций: List.of(), Set.of(), Map.of()");

        // Неизменяемый Список
        List<String> spells = List.of("Экспеллиармус", "Протего", "Ступефи", "Протего"); // Дубликаты разрешены
        System.out.println("Неизменяемый список заклинаний: " + spells);
        // spells.add("Инсендио"); // Вызовет UnsupportedOperationException! ОШИБКА!

        // Неизменяемое Множество
        Set<String> artifacts = Set.of("Мантия-невидимка", "Философский камень", "Бузинная палочка");
        System.out.println("Неизменяемое множество артефактов: " + artifacts);
        // artifacts.add("Маховик времени"); // Вызовет UnsupportedOperationException! ОШИБКА!
        // artifacts.add("Мантия-невидимка"); // Ошибки не будет, но и добавления тоже

        // Неизменяемая Карта (до 10 пар)
        Map<String, Integer> powerLevels = Map.of(
                "Гарри", 100,
                "Волдеморт", 500, // Упс!
                "Дамблдор", 450
        );
        System.out.println("Неизменяемая карта уровней силы: " + powerLevels);
        // powerLevels.put("Снейп", 300); // Вызовет UnsupportedOperationException! ОШИБКА!

        // Для создания неизменяемой карты с >10 парами используйте Map.ofEntries()
        Map<String, String> ministryDepts = Map.ofEntries(
                Map.entry("Отдел Тайн", "Уровень 9"),
                Map.entry("Отдел Правопорядка", "Уровень 2"),
                Map.entry("Отдел Катастроф", "Уровень 4")
                // ... можно добавить много entry
        );
        System.out.println("Неизменяемая карта отделов: " + ministryDepts);

        //💫 Другие способы создания коллекций
        System.out.println("\n\n  \uD83D\uDCAB Другие способы создания коллекций");

        // Arrays.asList(...)

        String[] spellArray = {"Экспеллиармус", "Протего", "Ступефи"};
        List<String> spellList = Arrays.asList(spellArray);
        System.out.println("Список из массива: " + spellList);
        spellList.set(0, "Инсендио"); // ОК! Изменить можно
        System.out.println("После изменения: " + spellList);
        // spellList.add("Акцио"); // ОШИБКА! UnsupportedOperationException
        //        Чтобы получить изменяемый ArrayList из массива, делают так:

        List<String> mutableSpellList = new ArrayList<>(Arrays.asList(spellArray));
        mutableSpellList.add("Акцио"); // Теперь можно!


        // Collections.singletonList(), singletonSet(), singletonMap()


        //Создают неизменяемую коллекцию (список, множество или карту), содержащую ровно один указанный элемент (или одну пару для Map). Иногда нужно передать в метод коллекцию с одним элементом, и это краткий и эффективный способ ее создать.
        //
        List<String> oneArtifact = Collections.singletonList("Маховик Времени");
        Set<Integer> oneNumber = Collections.singleton(42);
        // oneArtifact.add("Карта Мародеров"); // ОШИБКА! Неизменяемый


        // Collections.emptyList(), emptySet(), emptyMap()


        //Создают неизменяемую пустую коллекцию указанного типа.
        // Часто бывает нужно вернуть из метода пустую коллекцию вместо null,
        // чтобы избежать NullPointerException у вызывающего кода.
        // Эти методы предоставляют готовый, эффективный пустой экземпляр.
        //
        //public List<String> findSpellsByType(String type) {
        //    List<String> results = // ... поиск заклинаний ...
        //    if (results.isEmpty()) {
        //        return Collections.emptyList(); // Возвращаем пустой неизменяемый список
        //    }
        //    return results;
    }
}

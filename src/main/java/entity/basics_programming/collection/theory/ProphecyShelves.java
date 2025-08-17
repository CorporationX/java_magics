package entity.basics_programming.collection.theory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProphecyShelves {
    public static void main(String[] args) {
        // Создаем список пророчеств, используя ArrayList
        List<String> prophecyShelf97 = new ArrayList<>();

        // Добавляем пророчества (сохраняется порядок добавления)
        prophecyShelf97.add("Пророчество о Падении Темного Лорда (Трелони)");
        prophecyShelf97.add("Пророчество о Чемпионе Хогвартса (Неизвестно)");
        prophecyShelf97.add("Пророчество о Падении Темного Лорда (Трелони)"); // Дубликат разрешен!
        prophecyShelf97.add(1, "Пророчество о Втором Пришествии (Забыто)"); // Вставляем в середину (индекс 1)

        System.out.println("Пророчества на полке 97 (ArrayList):");
        for (String prophecy : prophecyShelf97) {
            System.out.println("- " + prophecy);
        }

        // Получаем пророчество по индексу (быстро для ArrayList)
        System.out.println("\nВторое пророчество на полке: " + prophecyShelf97.get(1));

        // --- Пример с LinkedList ---
        List<String> urgentProphecies = new LinkedList<>();
        urgentProphecies.add("Срочное: Опасность в Хогсмиде");
        urgentProphecies.addFirst("Сверхсрочное: Нападение Пожирателей"); // Быстрое добавление в начало
        urgentProphecies.removeLast(); // Быстрое удаление с конца

        System.out.println("\nСрочные пророчества (LinkedList): " + urgentProphecies);
    }
}
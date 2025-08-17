package entity.basics_programming.collection.ArrayList.task52;

import java.util.*;

import static entity.basics_programming.collection.ArrayList.task52.PotionStorage.showIngredients;

public class PotionStorageMain {
    public static void main(String[] args) {
        List<String> potionNames = new ArrayList<>();
        potionNames.add("Волчья аконитовая настойка");
        potionNames.add("Сладкая полынь");
        potionNames.add("Ртуть");
        potionNames.add("Лунная роса");
        potionNames.add("Кровь единорога");
        potionNames.add("Слёзы феникса");

        // Выведите изначальное содержимое списка
        System.out.println("Добро пожаловать в хранилище профессора Снейпа!\n\n" +
                "Изначальный список ингредиентов:");
        showIngredients(potionNames);

        //Добавьте новый ингредиент "Ядовитые щупальца" в конец списка и выведите обновленное содержание списка
        potionNames.add("Ядовитые щупальца");
        System.out.println("\nДобавление 'Ядовитых щупалец'...\n" +
                "Обновленный список:");
        showIngredients(potionNames);

        //Удалите элемент по случайному индексу от 0 до 10.
        // Выведите на экран название удаленного ингредиента и обновленный список.
        // Не забудьте обработать IndexOutOfBoundsException!
        // Программа не должна завершаться, достаточно вывода об ошибке в консоль.
        Random random = new Random();
        int randomIndex = random.nextInt(11);
        System.out.println("\nУдаление ингредиента под индексом " + randomIndex + "...");
        try {
            System.out.println("Удален: " + potionNames.get(randomIndex));
            potionNames.remove(randomIndex);
            showIngredients(potionNames);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ОШИБКА! Попытка удалить несуществующий ингредиент.\n"
                    + "Сообщение об ошибке: " + e.getMessage());
        }

        //Проверьте, есть ли в списке "Лунная роса" и если да, то выведите её индекс в консоль.
        System.out.println("\nПроверка наличия \"Лунная роса\"...");
        if (potionNames.contains("Лунная роса")) {
            System.out.println("\"Лунная роса\" найдена в хранилище под индексом "
                    + potionNames.indexOf("Лунная роса") + ".");
        } else {
            System.out.println("Не найдено.");
        }
        System.out.println("\nРабота с хранилищем завершена.");
    }
}

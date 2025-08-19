package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PotionStorage {
    public static void main(String[] args) {
        List<String> potions = new ArrayList<>();
        potions.add("Волчья аконитовая настойка");
        potions.add("Сладкая полынь");
        potions.add("Ртуть");
        potions.add("Лунная роса");
        potions.add("Кровь единорога");
        potions.add("Слезы феникса");

        showIngredients(potions);
    }

    public static void showIngredients(List<String> ingredients) {

        System.out.println(" Ингредиенты в хранилище ");
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println((i + 1) + ". " + ingredients.get(i));
        }

        System.out.println("\nДобавление 'Ядовитых щупалец'..." + "\n" + "Обновленный список: ");
        ingredients.add("Ядовитые щупальца");
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println((i + 1) + ". " + ingredients.get(i));
        }

        Random random = new Random();
        try {
            // Генерируем случайный индекс от 0 до 10
            int randomIndex = random.nextInt(11);

            // Получаем и удаляем элемент
            String removedIngredient = ingredients.remove(randomIndex);

            System.out.println("\nУдалён ингредиент: " + removedIngredient );
            System.out.println("Обновлённый список:");
            for (int i = 0; i < ingredients.size(); i++) {
                System.out.println((i + 1) + ". " + ingredients.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nОшибка: индекс " + e.getMessage() + " выходит за границы списка");
            System.out.println("Список остаётся без изменений: ");
            for (int i = 0; i < ingredients.size(); i++) {
                System.out.println((i + 1) + ". " + ingredients.get(i));
            }
        }
        int index = ingredients.indexOf("Лунная роса");
        System.out.println("\nПроверка наличия 'Лунная роса'...");
        if (ingredients.contains("Лунная роса")) {
            System.out.println("Лунная роса найдена под индексом " + index);
        } else {
            System.out.println("Лунная роса не была найдена");
        }
    }
}

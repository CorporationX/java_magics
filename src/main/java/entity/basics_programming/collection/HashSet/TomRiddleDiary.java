package entity.basics_programming.collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class TomRiddleDiary {
    public static void main(String[] args) {

        // 2️⃣В методе main класса TomRiddleDiary создайте HashSet для хранения объектов Spell.
        Set<Spell> tomRiddleDiary = new HashSet<>();

        // Добавьте в список несколько заклинаний, сознательно добавив одно и то же заклинание несколько раз:
        tomRiddleDiary.add(new Spell("Оживить", "Репаро"));
        tomRiddleDiary.add(new Spell("Освещение", "Люмос"));
        tomRiddleDiary.add(new Spell("Оживить", "Репаро")); // Дубликат
        tomRiddleDiary.add(new Spell("Оружие", "Экспеллиармус"));
        tomRiddleDiary.add(new Spell("Оружие", "Экспеллиармус")); // Дубликат

        // 3️⃣Поработайте с созданным HashSet:
        // Выведите размер сета после всех добавлений, чтобы убедиться, что он содержит только уникальные заклинания.
        System.out.println("размер сета после всех добавлений: " + tomRiddleDiary.size());

        // Проверьте, содержит ли сет определённое заклинание (например, new Spell("Освещение", "Люмос")).
        boolean isContains = tomRiddleDiary.contains(new Spell("Освещение", "Люмос"));
        System.out.println("Содержит ли сет определённое заклинание?"
                + "\n(например, new Spell(\"Освещение\", \"Люмос\"): "
                + (isContains ? "Да, " : "нет, не ") + "содержит");

        System.out.println("\nТекущий список заклинаний:");
        for (Spell spell : tomRiddleDiary) {
            System.out.println("\"" + spell.getName() + "\" - \"" + spell.getIncantation() + "\"");
        }

        // Удалите одно из заклинаний (например, new Spell("Оживить", "Репаро")).
        System.out.println("\nУдалили из списка new Spell(\"Оживить\", \"Репаро\")");
        tomRiddleDiary.remove(new Spell("Оживить", "Репаро"));

        // Выведите итоговый список уникальных заклинаний на экран.
        System.out.println("\nИтоговый список уникальных значений: ");
        for (Spell spell : tomRiddleDiary) {
            System.out.println("\"" + spell.getName() + "\" - \"" + spell.getIncantation() + "\"");
        }

        // пробовал создать метод print() - не получилось, при выводе передает:
        // entity.basics_programming.collection.HashSet.Spell@e0a3c94b,
        // entity.basics_programming.collection.HashSet.Spell@a1dc0b85]
        // а как их преобразовать в нормальный читаемый текст - не нашел..

    }
}
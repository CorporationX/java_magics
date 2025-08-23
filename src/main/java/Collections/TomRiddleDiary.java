package Collections;

import java.util.HashSet;
import java.util.Set;

public class TomRiddleDiary {
    public static void main(String[] args) {
        Set<Spell> tomRiddleDiary = new HashSet<>();

        tomRiddleDiary.add(new Spell("Оживить", "Репаро"));
        tomRiddleDiary.add(new Spell("Освещение", "Люмос"));
        tomRiddleDiary.add(new Spell("Оживить", "Репаро"));
        tomRiddleDiary.add(new Spell("Оружие", "Экспеллиармус"));
        tomRiddleDiary.add(new Spell("Оружие", "Экспеллиармус"));

        System.out.println("Размер дневника Тома Риддла: " + tomRiddleDiary.size());
        System.out.println("Уникальные заклинания: " + tomRiddleDiary.size() + " из 5 добавленных");


        Spell lumos = new Spell("Освещение", "Люмос");
        boolean hasLumos = tomRiddleDiary.contains(lumos);
        System.out.println("Содержит ли 'Освещение (Люмос)': " + hasLumos);

        Spell reparo = new Spell("Оживить", "Репаро");
        boolean removed = tomRiddleDiary.remove(reparo);
        System.out.println("Удалено ли 'Оживить (Репаро)': " + removed);

        System.out.println("Итоговый список заклинаний Тома Риддла:");
        for (Spell spell : tomRiddleDiary) {
            System.out.println(spell);
        }
        System.out.println("\nФинальный размер: " + tomRiddleDiary.size());
    }
}

package entity.basics_programming.collection.ArrayList;

import java.util.ArrayList;

public class ProphecyArchive {
    public static void main(String[] args) {
        ArrayList<String> prophecies = new ArrayList<>();
        prophecies.add("Пророчество о Падении Темного Лорда (Трелони)");
        prophecies.add("Пророчество о Чемпионе Хогвартса (Неизвестно)");
        prophecies.add("Пророчество о Втором Пришествии (Забыто)");

        System.out.println("Количество пророчеств: " + prophecies.size());
        System.out.println("Последнее добавленное пророчество: " + prophecies.get(prophecies.size() - 1));

        prophecies.remove(prophecies.size() - 1);

        System.out.println("\nПечать списка на экран: ");
        for (String prophecy : prophecies) {
            System.out.println(" - " + prophecy);
        }
//        System.out.println("Оставшиеся пророчества: " + prophecies);
    }
}

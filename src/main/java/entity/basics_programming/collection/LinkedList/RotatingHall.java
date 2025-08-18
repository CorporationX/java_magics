package entity.basics_programming.collection.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RotatingHall {
    public static void main(String[] args) {
        List<String> doors = new LinkedList<>();
        doors.add("Красная дверь");
        doors.add("Синяя дверь");
        doors.add("Зелёная дверь");
        doors.add("Жёлтая дверь");
        doors.add("Фиолетовая дверь");

        System.out.println(doors);

        Random random = new Random();
        int left = random.nextInt(doors.size());
        System.out.println("  Двери перемещаются на " + left + " дверей влево");

        for (int i = 0; i < left; i++) {
            doors.addLast(doors.removeFirst());
        }
        System.out.println(doors);

        int right = random.nextInt(doors.size());
        System.out.println("  Двери перемещаются на " + right + " дверей вправо");

        for (int i = 0; i < right; i++) {
            doors.addFirst(doors.removeLast());
        }
        System.out.println(doors);

        // Определяем центральную дверь
        System.out.println("  Центральная дверь: " + doors.get(doors.size() / 2));
    }
}

package Collections;

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
        doors.add("Розовая дверь");

        Random random = new Random();
        int left = random.nextInt(doors.size());
        System.out.println("Двери перемешаются на " + left + " влево");
        for (int i = 0; i < left; i++) {
            doors.addLast(doors.removeFirst());
        }

        int right = random.nextInt(doors.size());
        System.out.println("Двери перемешаются на " + right + " вправо");
        for (int i = 0; i < right; i++) {
            doors.addLast(doors.removeFirst());
        }
        int middleIndex = doors.size() / 2;
        String middleDoor = doors.get(middleIndex);
        System.out.println("Средняя дверь: " + middleDoor);
    }
}

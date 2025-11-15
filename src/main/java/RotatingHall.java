import java.util.LinkedList;
import java.util.Random;

public class RotatingHall {
    public static void main(String[] args) {
        LinkedList<String> doors = new LinkedList<>();

        //Добавляем двери
        doors.add("Красная дверь");
        doors.add("Синяя дверь");
        doors.add("Зелёная дверь");
        doors.add("Жёлтая дверь");
        doors.add("Фиолетовая дверь");

        //Смещение влево
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

        // Поиск двери посередине
        int midldeIndex = doors.size() / 2;
        System.out.println("Средняя дверь: " + midldeIndex);

    }
}

package entity.basics_programming.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathToPhilosophersStone {
    static void main() {
        // 1️⃣ В методе main класса PathToPhilosophersStone создайте список из комнат:
        List<String> rooms = new ArrayList<>();
        rooms.add("Зал с шахматами");
        rooms.add("Комната с ключами");
        rooms.add("Комната с зельями");
        rooms.add("Ловушка");
        rooms.add("Ловушка");
        rooms.add("Заколдованный коридор");
        rooms.add("Философский Камень");

        // 2️⃣ Начните прохождение лабиринта с первой комнаты.
        // Используйте цикл, чтобы герои двигались по комнатам до тех пор, пока не найдут "Философский Камень".
        // 3️⃣ На каждой итерации цикла проверяйте:
        // Если вы попали в "Ловушку", выведите сообщение об этом и перемешайте весь список комнат,
        // используя Collections.shuffle(list). Затем начните путь сначала.
        // Если вы попали в "Философский Камень", выведите сообщение о победе и завершите прохождение.
        // 4️⃣ В конце выведите список всех посещённых комнат (путь) и общее количество посещений.

        // создаем новый список для записи пройденного пути
        List<String> way = new ArrayList<>();

        int index = 0;
        int countCycles = 0;
        System.out.println("Комнаты подземелья: " + rooms);

        while (true) {
            countCycles++; // Считаем шаги

            // Создаем путь к Философскому камню
            way.add(rooms.get(index));

            // текущая комната
            String currentRoom = rooms.get(index);

            // нашли философский камень (выход из цикла)
            if (currentRoom.equals("Философский Камень")) break;

            // обнуляем индекс, чтобы запустить цикл с начала
            if (index == rooms.size()) index = 0;
            System.out.println("Пришли в комнату \"" + rooms.get(index) + "\"");

            // Ловушка, перемешиваем список комнат
            if (currentRoom.equals("Ловушка")) {
                Collections.shuffle(rooms);
                System.out.println("Попали в ловушку! Возвращаемся в начало..."
                        + "\nКомнаты подземелья перемешаны: " + rooms);
                index=0; continue;
            }
            index++;
        }
        System.out.println("Герои нашли Философский Камень!"
                + "\nПройденный путь: " + way
                + "\nВсего шагов: " + countCycles);

    }
}

package Collections;

import java.util.*;

public class PathToPhilosophersStone {
    public static void main(String[] args) {
        List<String> rooms = new ArrayList<>();
        rooms.add("Зал с шахматами");
        rooms.add("Комната с ключами");
        rooms.add("Комната с зельями");
        rooms.add("Ловушка");
        rooms.add("Ловушка");
        rooms.add("Заколдованный коридор");
        rooms.add("Философский Камень");

        System.out.println("Комнаты подземелья: " + rooms);

        List<String> fullWay = new ArrayList<>();
        int totalSteps = 0;
        int attemptCount = 0;

        boolean foundStone = false;

        while (!foundStone) {
            for (String way : rooms) {
                System.out.println("Пришли в комнату " + way);
                fullWay.add(way);
                totalSteps++;
                if (Objects.equals(way,"Ловушка")) {
                    fullWay.add(way);
                    attemptCount++;
                    System.out.println("Попали в ловушку! Возвращаемся в начало...");
                    Collections.shuffle(rooms);
                    break;
                } else if (Objects.equals(way, "Философский Камень")) {
                    System.out.println("Вы нашли камень, ура!");
                    foundStone = true;
                    break;
                }
            }
        }

        System.out.println("Общий путь: " + fullWay);
        System.out.println("Посетили комнат: " + totalSteps);
        System.out.println("Попыток: " + attemptCount);
    }
}

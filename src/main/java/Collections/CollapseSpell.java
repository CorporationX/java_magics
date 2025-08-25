package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollapseSpell {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);

        Random random = new Random();
        int iterations = 0;

        int newNumber = random.nextInt(16);
        boolean check = random.nextBoolean();

        System.out.println("Начальный список: " + numbers);

        while (numbers.size() > 1) {
            iterations++;


            System.out.println("\nИтерация " + iterations + ":");
            System.out.println("Новое число: " + newNumber);
            System.out.println("Добавить в конец: " + check);

            if (check) {
                while (!numbers.isEmpty() && newNumber > numbers.getLast()) {
                    System.out.println("Схлопывание конца: " + newNumber + " > " + numbers.getLast());
                    newNumber -= numbers.getLast();
                    numbers.removeLast();
                    System.out.println("Новое число после вычитания: " + newNumber);
                    System.out.println("Текущий список: " + numbers);
                }
                numbers.addLast(newNumber);
            } else {
                while (!numbers.isEmpty() && newNumber > numbers.getFirst()) {
                    System.out.println("Схлопывание начала: " + newNumber + " > " + numbers.getFirst());
                    newNumber -= numbers.getFirst();
                    numbers.removeFirst();
                    System.out.println("Новое число после вычитания: " + newNumber);
                    System.out.println("Текущий список: " + numbers);
                }
                numbers.addFirst(newNumber);
            }
            System.out.println("Список после итерации: " + numbers);
        }
        System.out.println("\nРезультат:");
        System.out.println("Потребовалось итераций: " + iterations);
        System.out.println("Финальный список: " + numbers);
    }
}

package entity.basics_programming.collection.LinkedList.task55;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollapseSpell {
    public static void main(String[] args) {
        //[3, 6, 7, 1, 2].
        List<Integer> magicalEnergy = new LinkedList<>();
        magicalEnergy.add(3);
        magicalEnergy.add(6);
        magicalEnergy.add(7);
        magicalEnergy.add(1);
        magicalEnergy.add(2);

        System.out.println("--- Изначальная конфигурация артефакта ---\n" + magicalEnergy);

        Random random = new Random();
        int countCycle = 1;

        while (magicalEnergy.size() > 1) {
            // Генерируйте новое случайное число от 0 до 15.
            int newRandomNumber = random.nextInt(16);
            boolean lastOrEnd = random.nextBoolean();

            System.out.print("Цикл " + countCycle + ": ");
            //Генерируйте случайный выбор (boolean) — вставлять новое число в начало или в конец списка.
            if (lastOrEnd) {
                System.out.print("Добавляем " + newRandomNumber + " в начало. ");
                // Логика "схлопывания" при вставке в начало: Проверьте, больше ли новое число первого элемента.
                // Если да, вычтите из нового числа первый элемент.
                // Удалите первый элемент.
                // Повторяйте это, пока новое число не перестанет быть больше первого элемента.
                // Затем добавьте получившееся число в начало. Если нет, просто добавьте новое число в начало.
                if (newRandomNumber > magicalEnergy.getFirst()) {
                    while (magicalEnergy.getFirst() < newRandomNumber) {
                        System.out.print("Схлопывание: ");
                        System.out.printf("%d - %d -> %d. ", newRandomNumber, magicalEnergy.getFirst(),
                                newRandomNumber - magicalEnergy.getFirst());
                        newRandomNumber -= magicalEnergy.getFirst();
                        magicalEnergy.removeFirst();
                    }
                    magicalEnergy.addFirst(newRandomNumber);
                } else {
                    magicalEnergy.addFirst(newRandomNumber);
                }
            } else {
                System.out.print("Добавляем " + newRandomNumber + " в конец. ");
                // Логика "схлопывания" при вставке в конец: Проверьте, больше ли новое число последнего элемента.
                // Если да, вычтите из нового числа последний элемент. Удалите последний элемент.
                // Повторяйте это, пока новое число не перестанет быть больше последнего элемента.
                // Затем добавьте получившееся число в конец. Если нет, просто добавьте новое число в конец.
                if (newRandomNumber > magicalEnergy.getLast()) {
                    while (magicalEnergy.getLast() < newRandomNumber) {
                        System.out.print(" Схлопывание: ");
                        System.out.printf("%d - %d -> %d. ", newRandomNumber, magicalEnergy.getLast(),
                                newRandomNumber - magicalEnergy.getLast());
                        newRandomNumber -= magicalEnergy.getLast();
                        magicalEnergy.removeLast();
                    }
                    magicalEnergy.addLast(newRandomNumber);
                } else {
                    magicalEnergy.addLast(newRandomNumber);
                }
            }
            System.out.println("Текущая конфигурация: " + magicalEnergy);
            countCycle++;
        }

        System.out.println("--- Артефакт достиг стабильного состояния ---" +
                "\nКоличество циклов: " + countCycle +
                "\nФинальное число: " + magicalEnergy.getFirst());

    }
}

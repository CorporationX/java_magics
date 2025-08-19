package entity.basics_programming.collection.LinkedList.task55;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollapseSpell {
    public static void main(String[] args) {
        // 1️⃣ В методе main класса CollapseSpell создайте LinkedList  со строго заданными начальными числами: [3, 6, 7, 1, 2].
        List < Integer > magicalEnergy = new LinkedList < > ();
        magicalEnergy.add(3);
        magicalEnergy.add(6);
        magicalEnergy.add(7);
        magicalEnergy.add(1);
        magicalEnergy.add(2);

        System.out.println("--- Изначальная конфигурация артефакта ---\n" + magicalEnergy);

        // 2️⃣Запустите цикл while, который будет работать до тех пор, пока в списке не останется один элемент
        Random random = new Random();
        int countCycles = 1;
        while (magicalEnergy.size() != 1) {
            // while (countCycles != 10) {
            // 3️⃣Внутри цикла на каждой итерации:
            // Генерируйте новое случайное число от 0 до 15.
            int newRandomNumber = random.nextInt(16);
            boolean isFirst = random.nextBoolean(); // true - вставляем в начало

            System.out.print("Цикл " + countCycles + ": ");
            if (isFirst) {
                System.out.print("Добавляем " + newRandomNumber + " в начало. ");
                while (magicalEnergy.size() != 0 && newRandomNumber > magicalEnergy.getFirst()) {
                    System.out.print("Схлопывание: " + newRandomNumber + " - " +
                            magicalEnergy.getFirst() + " -> " +
                            (newRandomNumber - magicalEnergy.getFirst()) + ". ");
                    newRandomNumber -= magicalEnergy.getFirst();
                    if (magicalEnergy.size() > 0) magicalEnergy.removeFirst();
                    // 3 часа не мог понять в чем дело, а все из-за невозможности удалить пустой элемент ((
                }
                magicalEnergy.addFirst(newRandomNumber);

            } else {
                System.out.print("Добавляем " + newRandomNumber + " в конец. ");
                while (magicalEnergy.size() != 0 && newRandomNumber > magicalEnergy.getLast()) {
                    System.out.print("Схлопывание: " + newRandomNumber + " - " +
                            magicalEnergy.getLast() + " -> " +
                            (newRandomNumber - magicalEnergy.getLast()) + ". ");
                    newRandomNumber -= magicalEnergy.getLast();
                    if (magicalEnergy.size() > 0) magicalEnergy.removeLast();
                    // 3 часа не мог понять в чем дело, а все из-за невозможности удалить пустой элемент ((
                }
                magicalEnergy.addLast(newRandomNumber);
            }
            System.out.println("Текущая конфигурация: " + magicalEnergy);
            // 4️⃣Считайте количество "циклов" (итераций цикла while), которое потребовалось,
            // чтобы список стал пустым или в нём остался один элемент.
            countCycles++;
        }

        // 5️⃣В конце программы выведите количество циклов и итоговое число, оставшееся в списке.
        System.out.println("\n--- Артефакт достиг стабильного состояния ---\n" +
                "Количество циклов: " + (countCycles - 1) +
                "\nФинальное число: " + magicalEnergy.getFirst());
    }
}

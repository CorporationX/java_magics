package entity.basics_programming.collection.LinkedList;

import java.util.LinkedList;

public class MinistryQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Гарри");
        queue.add("Рон");
        queue.add("Гермиона");

        System.out.println("Первый посетитель: " + queue.getFirst());
        System.out.println("Последний посетитель: " + queue.getLast());

        queue.removeFirst();
        System.out.println("Обновленная очередь после обслуживания первого посетителя:\n" + queue);
    }
}

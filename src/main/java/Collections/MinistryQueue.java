package Collections;

import java.util.LinkedList;
import java.util.List;

public class MinistryQueue {
    public static void main(String[] args) {
        List<String> queue = new LinkedList<>();
        queue.add("Гарри Поттер");
        queue.add("Северус Снегг");
        queue.add("Сириус Блэк");

        System.out.println("Первый и последний посетители: ");
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());

        System.out.println("\nОбновлённая очередь: ");
        queue.removeFirst();
        System.out.println(queue);
    }
}

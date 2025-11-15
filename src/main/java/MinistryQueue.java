import java.util.LinkedList;

public class MinistryQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        //Добавляем посетителей
        queue.add("Гарри Поттер");
        queue.add("Рон Уизли");
        queue.add("Гермиона Грейнджер");

        //Вывод первого и последнего посетителя
        System.out.println("Первый посетитель: " + queue.getFirst());
        System.out.println("Последний посетитель: " + queue.getLast());

        //Удаляем первого посетителя
        queue.removeFirst();
        //Вывод обновленной очереди
        System.out.println("Обновленная очередь: " + queue);

    }
}

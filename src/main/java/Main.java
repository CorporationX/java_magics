import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static List<String> names = new ArrayList<>();
    static Map<String, String> students = new HashMap<>();

    public static void main(String[] args) throws AlreadyExistException, NotFoundException {
        // 1. Регистрация студентов в Хогвартс. Реализовать метод register(String name, String faculty).
        // 2. Находим студентов по имени, чтобы проверить их факультет. String findFaculty(String name)
        // 3. main -> регистрируем. Если есть дубль, то мы выбросим исключение. Попробуем повызывать имена студентов,
        // а если студента нет, то выбросим исключение, что такого студента нет.
        // 4. Вывести всех студентов.

        // TODO переработать так, чтобы даже после исключения можно было бы добавить остальных
        try {
            register("Гарри Поттер", "Гриффиндор");
            register("Рон", "Гриффиндор");
            register("Гермиона", "Гриффиндор");
            register("Гарри Поттер", "Гриффиндор");
            register("Драко", "Слизерин");
        } catch (AlreadyExistException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println("Факультет Гарри Поттера: " + findFaculty("Гарри Поттер"));
            System.out.println("Факультет Рона: " + findFaculty("Рон"));
            System.out.println("Факультет Гермионы: " + findFaculty("Гермиона"));
            System.out.println("Факультет Драко: " + findFaculty("Драко"));
        } catch (NotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        printNames(names);
    }

    public static void register(String name, String faculty) throws AlreadyExistException {
        if (students.containsKey(name)) {
            throw new AlreadyExistException("Такой студент уже существует: " + name + ". Не добавляем его.");
        }
        students.put(name, faculty);
        names.add(name);
    }

    public static String findFaculty(String name) throws NotFoundException {
        if (!students.containsKey(name)) {
            throw new NotFoundException("Студент не найден: " + name);
        }
        return students.get(name);
    }

    public static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println("Студент: " + name);
        }
    }
}

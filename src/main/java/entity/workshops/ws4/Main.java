package entity.workshops.ws4;

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

        // добавил 2а метода в которых регистрирую и печатаю, чтобы внутри этих методов отлавливало исключения

//            register("Гарри Поттер", "Гриффиндор");
//            register("Рон", "Гриффиндор");
//            register("Гермиона", "Гриффиндор");
//            register("Гарри Поттер", "Гриффиндор");
//            register("Драко", "Слизерин");

        processRegister("Гарри Поттер", "Гриффиндор");
        processRegister("Рон", "Гриффиндор");
        processRegister("Гарри Поттер", "Гриффиндор");
//        processRegister("Драко", "Слизерин");
        processRegister("Гермиона", "Гриффиндор");

        printFindFaculty("Гарри Поттер");
        printFindFaculty("Рон");
        printFindFaculty("Драко");
        printFindFaculty("Гермиона");

        printNames(names);
    }

    public static void processRegister(String name, String faculty) {
        try {
            register(name, faculty);
        } catch (AlreadyExistException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void register(String name, String faculty) throws AlreadyExistException {
        if (students.containsKey(name)) {
            throw new AlreadyExistException("Такой студент уже существует: " + name + ". Не добавляем его.");
        }
        students.put(name, faculty);
        names.add(name);
    }

    private static String findFaculty(String name) throws NotFoundException {
        if (!students.containsKey(name)) {
            throw new NotFoundException("Студент не найден: " + name);
        }
        return students.get(name);
    }

    public static void printFindFaculty(String name) {
        try {
            if (findFaculty(name) != null)
                System.out.println("Факультет ученика \"" + name + "\": " + findFaculty(name));
        } catch (NotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println("Студент: " + name);
        }
    }
}

package entity.basics_programming.collection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueStudents {
    public static void main(String[] args) {
        // 🔮 60. Удаление дубликатов студентов и сохранение порядка
        // В Хогвартсе составляют список студентов, но он записан в ArrayList, где могут быть повторы.
        // Нужно убрать дубликаты, но оставить студентов в том порядке, в котором они встретились впервые.
        // Описание задачи:
        // 1️⃣ В методе main класса UniqueStudents задайте список с исходными данными:
        List < String > students = new ArrayList < > ();
        students.add("Гарри");
        students.add("Рон");
        students.add("Гермиона");
        students.add("Гарри"); // Дубликат
        students.add("Невилл");
        students.add("Рон"); // Дубликат

        // 2️⃣ Используйте HashSet, чтобы быстро проверять дубликаты.
        Set< String > unicStudents = new HashSet< >();
        List< String > newStudents = new ArrayList< >();

        // 3️⃣ Пройдитесь по ArrayList, добавляя в новый ArrayList только тех, кого ещё нет в HashSet.
        for (String student: students) {
            if (unicStudents.add(student)) {
                newStudents.add(student);
            }
        }

        System.out.println("Список студентов без повторов:");
        for (String student: newStudents)
            System.out.print(student + " ");
    }
}
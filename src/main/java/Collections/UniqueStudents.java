package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueStudents {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Гарри");
        students.add("Рон");
        students.add("Гермиона");
        students.add("Гарри");
        students.add("Невилл");
        students.add("Рон");

        Set<String> uniqueStudents = new HashSet<>();
        List<String> finalList = new ArrayList<>();

        for (String student : students) {
            if (uniqueStudents.add(student)) {
                finalList.add(student);
            }
        }
        System.out.println("Список без повторов:");
        for (String student : finalList) {
            System.out.println(student);
        }
    }
}

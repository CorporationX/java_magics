package Collections;

import java.util.ArrayList;
import java.util.List;

public class ProphecyArchive {
    public static void main(String[] args) {
        List<String> prophecy = new ArrayList<>(3);
        prophecy.add("Пророчество 1");
        prophecy.add("Пророчество 2");
        prophecy.add("Пророчество 3");

        for (String prophecyArchive : prophecy) {
            System.out.println(prophecyArchive);
        }

        System.out.println("Количество пророчеств: " + prophecy.size());
        System.out.println("Последнее добавленное пророчество: " + prophecy.getLast());
        prophecy.remove("Пророчество 2");

        for (String prophecyUpdate : prophecy) {
            System.out.println(prophecyUpdate);
        }
    }
}

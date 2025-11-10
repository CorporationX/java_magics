import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProphecyArchive {
    public static void main(String[] args) {
        List<String> prophecies = new ArrayList<>(3); // АррайЛист для пророчеств

        //Добавляем пророчества
        prophecies.add("Пророчество о Гарри Поттере");
        prophecies.add("Пророчество о Тёмном Лорде");
        prophecies.add("Пророчество о новом защитнике Хогвартса");

        //Количество пророчеств
        System.out.println("Количество пророчеств: " + prophecies.size());

        //Последнее добавленое проочество
        System.out.println("Последнее добавленное пророчество: " + prophecies.get(prophecies.size() - 1));

        // Удаление пророчества
        prophecies.remove(1);
        System.out.println("Оставшиеся пророчества: " + prophecies);
    }
}

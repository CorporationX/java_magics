import java.util.ArrayList;
import java.util.List;

public class LongestProphecy {
    public static void main(String[] args) {
        List<String> prophecies = new ArrayList<>();
        prophecies.add("Короткое пророчество");
        prophecies.add("Самое длинное пророчество, что занимает больше всего места");
        prophecies.add("Длинное пророчество,но не достаточно");

        //Сравниваем строки и ищем самое длинное пророчество
        String longest = "";
        for (String prophecy : prophecies) {
            if (prophecy.length() > longest.length()) {
                longest = prophecy;
            }
        }
        // Вывод
        System.out.println("Самое длинное пророчество: " + longest);
    }
    }
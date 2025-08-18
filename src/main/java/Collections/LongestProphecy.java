package Collections;

import java.util.ArrayList;
import java.util.List;

public class LongestProphecy {
    public static void main(String[] args) {
        List<String> prophecies = new ArrayList<>(3);
        prophecies.add("Пророчество 1");
        prophecies.add("Длинное пророчество");
        prophecies.add("Самое длинное пророчество");

        String longest = "";
        for (String prophecy : prophecies) {
            if (prophecy.length() > longest.length()) {
                longest = prophecy;
            }
        }
        System.out.println("Самое длинное пророчество: " + longest);
    }
}

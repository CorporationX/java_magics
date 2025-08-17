package entity.basics_programming.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LongestProphecy {
    public static void main(String[] args) {
        List<String> prophecies = new ArrayList<>();
        prophecies.add("Пророчество о Падении Темного Лорда (Трелони)");
        prophecies.add("Пророчество о Чемпионе Хогвартса по квиддичу в 2055 году");
        prophecies.add("Пророчество о Втором Пришествии (Забыто)");
        prophecies.add("Пророчество о приключении двух волшебников");

        int maxLengthIndex = 0;
        int maxLength = 0;
        for (int index = 0; index < prophecies.size(); index++) {
            if (maxLength < prophecies.get(index).length()) {
                maxLength = prophecies.get(index).length();
                maxLengthIndex = index;
            }
        }
        System.out.println("Самое длинное пророчество:\n" + prophecies.get(maxLengthIndex));
    }
}

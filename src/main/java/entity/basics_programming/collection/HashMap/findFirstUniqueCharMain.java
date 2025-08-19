package entity.basics_programming.collection.HashMap;

import static entity.basics_programming.collection.HashMap.UniqueCharacterFinder.findFirstUniqueChar;

public class findFirstUniqueCharMain {
    public static void main(String[] args) {
        String text = "abracadabra";
        Character firstUnique = findFirstUniqueChar(text);
        System.out.println("Первый уникальный символ: " + firstUnique);

        text = "abraccaddabra";
        firstUnique = findFirstUniqueChar(text);
        System.out.println("Первый уникальный символ: " + firstUnique);
    }
}

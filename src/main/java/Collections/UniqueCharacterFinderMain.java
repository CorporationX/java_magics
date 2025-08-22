package Collections;

import static Collections.UniqueCharacterFinder.findFirstUniqueChar;

public class UniqueCharacterFinderMain {
    public static void main(String[] args) {
        String text = "abracadabra";
        Character firstUnique = findFirstUniqueChar(text);
        System.out.println("Первый уникальный символ: " + firstUnique);

        text = "hheello";
        firstUnique = findFirstUniqueChar(text);
        System.out.println("Первый уникальный символ: " + firstUnique);
    }
}

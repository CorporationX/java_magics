package Collections;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterFinder {
    public static Character findFirstUniqueChar(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Character firstUnicSymbol = null;

        for (char c : text.toCharArray()) {
            if (map.get(c) == 1) {
                firstUnicSymbol = c;
                break;
            }
        }
        return firstUnicSymbol;
    }
}

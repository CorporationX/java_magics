package Collections;

import java.util.HashMap;
import java.util.Map;

public class MagicBattle {
    public static void main(String[] args) {
        Map<String, String> wizards = new HashMap<>();
        wizards.put("Harry", "Экспеллиармус");
        wizards.put("Ron", "Тоталус");

        if (wizards.containsKey("Neville")) {
            System.out.println("Заклинание Невилла: " + wizards.get("Neville"));
        } else {
            wizards.put("Neville", "Ступефи");
        }

        System.out.println("Маги и их заклинания: ");
        for (String wizard : wizards.keySet()) {
            System.out.println(wizard + ": " + wizards.get(wizard));
        }
    }
}

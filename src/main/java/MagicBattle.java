import java.util.HashMap;
import java.util.Map;

public class MagicBattle {
    public static void main(String[] args) {
        Map<String, String> defenseSpells = new HashMap<>();
        defenseSpells.put("Harry ", " Экспеллиармус");
        defenseSpells.put("Hermione ", " Протего");
        defenseSpells.put("Ron ", " Петрификус Тоталус");

        if (!defenseSpells.containsKey("Neville")) {
            defenseSpells.put("Neville ", " Ступефи");
        }

        for (Map.Entry<String, String> entry : defenseSpells.entrySet()) {
            System.out.println(entry.getKey() + "использует" + entry.getValue());
        }


    }
}

package entity.basics_programming.collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MagicBattle {
    public static void main(String[] args) {
        Map<String,String> defenceSpells = new HashMap<>();
        defenceSpells.put("Harry", "Экспеллиармус");
        defenceSpells.put("Hermione", "Протего");
        defenceSpells.put("Ron", "Петрификус Тоталус");
        defenceSpells.put("Neville", null);

        System.out.println("Есть ли у Невилла заклинание?");
//        if(defenceSpells.get("Neville") == null) {
        if(!defenceSpells.containsKey("Neville")){
            System.out.println("Нет, присвоим.");
            defenceSpells.put("Neville", "Ступефи");
        }
        else
            System.out.println("Есть: " + defenceSpells.get("Neville"));

        for (Map.Entry<String, String> entry : defenceSpells.entrySet()) {
            System.out.println(entry.getKey() + " использует " + entry.getValue());
        }

    }
}

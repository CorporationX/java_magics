package entity.basics_programming.collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ArchiveCleanup {
    public static void main(String[] args) {
        Map<String,String> wizards = new HashMap<>();
        wizards.put("Harry", "Орден Феникса");
        wizards.put("Sirius", "Орден Феникса");
        wizards.put("Lucius", "Пожиратель Смерти");
        wizards.put("Bellatrix", "Пожиратель Смерти");


        // Создаём новый HashMap без дубликатов по значению
        Map<String, String> cleanedWizards = new HashMap<>();

        for (Map.Entry<String, String> entry : wizards.entrySet()) {
            if(!cleanedWizards.containsValue(entry.getValue())){
                cleanedWizards.put(entry.getKey(), entry.getValue());
            }
        }

        for (Map.Entry<String, String> entry : cleanedWizards.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

package Collections;

import java.util.HashMap;
import java.util.Map;

public class ArchiveCleanup {
    public static void main(String[] args) {
        Map<String, String> archive = new HashMap<>();
        archive.put("Harry", "Орден Феникса");
        archive.put("Sirius", "Орден Феникса");
        archive.put("Lucius", "Пожиратель Смерти");
        archive.put("Bellatrix", "Пожиратель Смерти");

        Map<String, String> cleanedArchive = new HashMap<>();


        for (Map.Entry<String, String> entry : archive.entrySet()) {
            if (!cleanedArchive.containsValue(entry.getValue())) {
                cleanedArchive.put(entry.getKey(), entry.getValue());
            }
        }

        for (Map.Entry<String, String> entry : cleanedArchive.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

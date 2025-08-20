package entity.basics_programming.collection.collections;

import java.util.Collections;
import java.util.Map;

public class StrongestWizard {
    static void main() {
        Map<String, Integer> wizards = Map.of(
                "Гарри", 100,
                "Рон", 80,
                "Гермиона", 90,
                "Волдеморт", 200, // Упс!
                "Дамблдор", 300
        );

        for (Map.Entry<String, Integer> entry : wizards.entrySet()) {
            if (entry.getKey() != null && entry.getValue() == Collections.max(wizards.values()))
                System.out.printf("Самый могущественный маг: %s (Сила: %d)",
                        entry.getKey(), Collections.max(wizards.values()));
        }
    }
}

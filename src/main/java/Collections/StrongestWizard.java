package Collections;

import java.util.Collections;
import java.util.Map;

public class StrongestWizard {
    public static void main(String[] args) {
        Map<String, Integer> wizards = Map.of(
                "Гарри Поттер", 100,
                "Гермиона", 91,
                "Дамблдор", 500

        );

        int maxPower = Collections.max(wizards.values());

        String strongerWizard = "";
        for (Map.Entry<String, Integer> entry : wizards.entrySet()) {
            if (entry.getValue() == maxPower) {
                strongerWizard = entry.getKey();
                break;
            }
        }
        System.out.println("Самый могущественный волшебник " + strongerWizard + "\n" + "Его сила: " + maxPower);
    }
}

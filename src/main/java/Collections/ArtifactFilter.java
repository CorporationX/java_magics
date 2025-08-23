package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArtifactFilter {
    public static void main(String[] args) {
        String[] allArtifacts = {
                "Мантия-невидимка", "Философский камень", "Чаша Хаффлпафф",
                "Мантия-невидимка", "Философский камень", "Меч Гриффиндора"
        };


        Set<String> uniqueArtifacts = new HashSet<>();
        Map<String, Integer> artifactCount = new HashMap<>();

        for (String artifact : allArtifacts) {
            uniqueArtifacts.add(artifact);

            if (!artifactCount.containsKey(artifact)) {
                artifactCount.put(artifact, 1);
            } else {
                int count = artifactCount.get(artifact);
                artifactCount.put(artifact, count + 1);
            }
        }

        System.out.println("Уникальные артефакты:");
        for (String artifact : uniqueArtifacts) {
            System.out.println(artifact + " – встречается " + artifactCount.get(artifact) + " раз(а)");
        }
    }
}


package entity.basics_programming.collection.HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArtifactFilter {
    public static void main(String[] args) {
        // 1️⃣ В методе main класса ArtifactFilter задайте массив из артефактов:
        String[] allArtifacts = {
                "Мантия-невидимка",
                "Философский камень",
                "Чаша Хаффлпафф",
                "Мантия-невидимка",
                "Философский камень",
                "Меч Гриффиндора"
        };
        // 2️⃣ Используйте HashSet, чтобы оставить только уникальные артефакты.
        Set < String > unicArtifacts = new HashSet < > ();
        // 3️⃣ Используйте HashMap, чтобы посчитать, сколько раз каждый артефакт встречался.
        // Например, сначала получить значение, а потом вернуть новое.
        Map < String, Integer > artifacts = new HashMap < > ();
        for (String artifact: allArtifacts) {
            unicArtifacts.add(artifact);
            if (!artifacts.containsKey(artifact)) {
                artifacts.put(artifact, 1);
            } else {
                int cnt = artifacts.get(artifact);
                artifacts.put(artifact, cnt + 1);
            }
        }

        // 4️⃣ Выведите список уникальных артефактов и количество повторов каждого предмета.
        System.out.println("Уникальные артефакты:");

        for (String artifact: unicArtifacts) {
            if (artifacts.get(artifact) == 1)
                System.out.println(artifact + " – встречается " + artifacts.get(artifact) + " раз");
            else
                System.out.println(artifact + " – встречается " + artifacts.get(artifact) + " раза");
        }
    }
}
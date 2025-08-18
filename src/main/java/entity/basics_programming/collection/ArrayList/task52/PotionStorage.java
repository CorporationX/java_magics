package entity.basics_programming.collection.ArrayList.task52;

import java.util.List;

public class PotionStorage {
    public static void showIngredients(List<String> ingredients){
        int i = 1;
        for(String ingredient : ingredients){
            System.out.println(i + ". " + ingredient);
            i++;
        }
    }
}

package entity.basics_programming.oop_advanced;

import java.util.Random;

public class MagicalNumberTransformation {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            builder.append(rand.nextInt(10));
        }

        String numberString = builder.toString();
        print(numberString);

        String replace_i = numberString.replace("1", "i");
        print(replace_i);

        String withoutMinus = replace_i.replace("-", "");
        print(withoutMinus);

        String replace_0 = withoutMinus.replace("0", "o");
        print(replace_0);

        String replace_6 = replace_0.replace("6", "b");
        print(replace_6);

        boolean contains23 = replace_6.contains("23");
        System.out.println("Содержится ли \"23\" в строке: " + (contains23 ? "Да" : "Нет"));

        int index_ob = replace_6.indexOf("ob");
        System.out.println("Индекс подстроки \"ob\" в строке: " + (index_ob >= 0 ? index_ob : "не присутствует"));
    }

    static void print(String stringInput) {
        System.out.println(stringInput);
    }
}

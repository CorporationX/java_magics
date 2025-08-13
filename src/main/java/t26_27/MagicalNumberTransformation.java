package t26_27;

import java.util.Random;

public class MagicalNumberTransformation {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //Random randomNumber = new Random();

        for (int i = 1; i <= 5; i++) {
            //builder.append(randomNumber.nextInt(10));
            builder.append(new Random().nextInt());

        }
        System.out.println("Сгенерированная строка чисел: " + builder.toString());

        String replace0 = builder.toString().replace("-", "");
        System.out.println("Строка без \"-\": " + replace0);

        String replace1 = replace0.replace("1", "i");
        System.out.println("Строка \"1\" -> \"i\": " + replace1);

        String replace2 = replace1.replace('0', 'o');
        System.out.println("Строка \"0\" -> \"o\": " + replace2);

        String replace3 = replace2.replace('6', 'b');
        System.out.println("Строка \"6\" -> \"b\": " + replace3);


        boolean hasSubstring23 = replace3.contains("23");
        System.out.println(hasSubstring23);

        int indexOb = replace3.indexOf("ob");
        System.out.println("Индекс ob: " + indexOb);


    }
}

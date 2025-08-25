import java.util.Random;

public class MagicalNumberTransformation {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            builder.append(new Random().nextInt(10));
        }

        String numberString = builder.toString();
        System.out.println("Исходный код: " + numberString);

        String replacedOnes = numberString.replace("1", "i");
        System.out.println("Заменили '1' на 'i': " + replacedOnes);

        String noDashes = replacedOnes.replace("-", "");
        System.out.println("Заменили '-' на '': " + noDashes);

        String replacedZero = noDashes.replace("0", "o");
        System.out.println("Заменили '0' на 'o': " + replacedZero);

        String replacedSixes = replacedZero.replace("6", "b");
        System.out.println("Заменили '6' на 'b': " + replacedSixes);

        boolean constant23 = replacedSixes.contains("23");
        System.out.println("Содержит '23': " + constant23);

        int indexOb = replacedSixes.indexOf("ob");
        System.out.println("Индекс 'od': " + indexOb);
    }
}

import java.util.Random;

public class MagicalNumberTransformation {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            builder.append(new Random().nextInt(10));
        }
        String numberString = builder.toString();

        System.out.println(builder);
        String result = numberString.replace("1", "i");
        String noMinus = result.replace("-", " ");
        String noZero = noMinus.replace("0", "o");
        String noSix = noZero.replace("6", "b");
        System.out.println(noSix);

        boolean search = noSix.contains("23");
        System.out.println(search);

        int search2 = noSix.indexOf("ob");
        System.out.println(search2);
    }
}

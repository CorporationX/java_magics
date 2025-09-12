import java.util.Random;

public class MagicalNumberTransformation {
    public static void main(String[] args) {
        // Создаем строку
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= 5; i++ ) {
            builder.append(new Random().nextInt(10));
        }
            String numberString = builder.toString();
        System.out.println("Исходная строка: " + numberString);

        // Убираем 1
        String charm = numberString;
        String replacedOnes = charm.replace("1", "i");
        System.out.println("После замены 1: " + replacedOnes);

        //Убираем '-'
        String noDashes = replacedOnes.replace("-", "");
        System.out.println("После удаления '-': " + noDashes);

        // Убираем 0
        String replaceNule = noDashes.replace("0", "o");
        System.out.println("После замены 0: " + replaceNule);

        // Убираем 6
        String replaceSix = replaceNule.replace("6", "b");
        System.out.println("После замены 6: " + replaceSix);

        // Проверяем 23
        boolean contains23 = replaceSix.contains("23");
        System.out.println("Проверяем 23: " + contains23);

        //
        int indexOb = replaceSix.indexOf("ob");
        System.out.println("Индекс ob: " + indexOb);
    }
}

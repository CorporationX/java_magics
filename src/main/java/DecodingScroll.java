public class DecodingScroll {
    public static void main(String[] args) {
        String part1 = "munortaP";
        String part2 = "otcep";
        String part3 = "xE";

        // Объединение через оператор "+"
        String all = part1 + part2 + part3;

        // Объединение через StringBuilder
        StringBuilder result = new StringBuilder();
        result.append(part1);
        result.append(part2);
        result.append(part3);
        System.out.println(all);

        // Разворот строчки
        String reversAll = new StringBuilder(all).reverse().toString();
        System.out.println(reversAll);

        //
        String target = "ExpectoPatronum";
        boolean compareByReference = (reversAll == target); // Сравнение строк
        System.out.println("Сравнение строк: " + compareByReference);
        boolean compareByContent = reversAll.equals(target); // Сравнение содержимого
        System.out.println("Сравнение содержимого: " + compareByContent);
    }
}


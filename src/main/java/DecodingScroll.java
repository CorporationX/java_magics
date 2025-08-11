public class DecodingScroll {
    public static void main(String[] args) {
        String part1 = "munortaP";
        String part2 = "otcep";
        String part3 = "xE";

        StringBuilder result = new StringBuilder();
        result.append(part1);
        result.append(part2);
        result.append(part3);

        String reversedResult = result.reverse().toString();

        String target = "ExpectoPatronum";

        boolean compareByReference = (reversedResult == target);
        System.out.println("Сравнение через == : " + compareByReference);

        boolean compareByContent = reversedResult.equals(target);
        System.out.println("Сравнение через equals : " + compareByContent);
    }
}

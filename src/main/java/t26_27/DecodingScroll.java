package t26_27;

public class DecodingScroll {
    public static void main(String[] args) {
        String part1 = "munortaP";
        String part2 = "otcep";
        String part3 = "xE";

        String incantation = "ExpectoPatronum";

        StringBuilder result = new StringBuilder();
        result.append(part1).append(part2).append(part3);
        System.out.println(result.toString());
        result.reverse();
        System.out.println(result.toString());

        boolean compare1 = result.toString() == incantation;
        System.out.println(compare1);

        boolean compare2 = result.toString().equals(incantation);
        System.out.println(compare2);
    }
}

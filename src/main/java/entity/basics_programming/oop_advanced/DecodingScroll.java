package entity.basics_programming.oop_advanced;

public class DecodingScroll {
    public static void main(String[] args) {
        String part1 = "munortaP";
        String part2 = "otcep";
        String part3 = "xE";

//        String stringConcat =  part1 + part2 + part3;
//        System.out.println(stringConcat);

        String verification = "ExpectoPatronum";

        StringBuilder result = new StringBuilder();
        result.append(part1);
        result.append(part2);
        result.append(part3);

        System.out.println("Сравнение через equals: " + result.reverse().toString().equals(verification));
        System.out.println("Сравнение через ==: " + (result.reverse().toString() == verification));
    }
}

public class WandMain {
    public static void main(String[] args) {

        Wand wandGarry = new Wand(31, "Перо феникса", "Тис");
        System.out.println("Палочка 1: " + wandGarry.woodType
                + ", ядро: " + wandGarry.core
                + ", длина: " + wandGarry.length + " см");

        Wand wandRon = new Wand(34, "Волос единорога", "Ясень");
        System.out.println("Палочка 1: " + wandRon.woodType
                + ", ядро: " + wandRon.core
                + ", длина: " + wandRon.length + " см");
    }
}

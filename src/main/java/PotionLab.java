public class PotionLab {
    public static void main(String[] args) {
        int students = 15;
        String potion = "Оборотное зелье ";


        // 1. Создаем конструктор для зелья
        PotionCalculator calculator = new PotionCalculator();

        // 2. Расчет
        int neededSlugs = calculator.calculateNeededSlugs(students);
        int neededFluxweed = calculator.calculateNeededFluxweed(students);
        System.out.println("Пиявок необходимо: " + neededSlugs);
        System.out.println("Водорослей необходимо: " + neededFluxweed);

        // 3.
        String label = calculator.getPotionLabel(potion, students, neededSlugs, neededFluxweed);
        System.out.println(label);
    }
}

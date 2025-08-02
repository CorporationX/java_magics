public class PotionLab {
    public static void main(String[] args) {
        int students = 17;
        String potion = "Оборотное зелье";

        PotionCalculator calculator = new PotionCalculator();

        int slugsNeeded = calculator.calculateNeededSlugs(students);
        int fluxweedNeeded = calculator.calculateNeededFluxweed(students);

        System.out.println("Необходимо сушеных пиявок: " + slugsNeeded);
        System.out.println("Необходимо пучков водорослей: " + fluxweedNeeded);


        String label = calculator.getPotionLabel(potion, students, slugsNeeded, fluxweedNeeded);
        System.out.println(label);

    }
}

public class PotionLab {
    public static void main(String[] args) {
        int students = 15;

        PotionCalculator calculator = new PotionCalculator();
        int slugsNeeded = calculator.calculateNeededSlugs(students);
        int fluxweedNeeded = calculator.calculateNeededFluxweed(students);
        String potionName = "Оборотное зелье";
        String label = calculator.getPotionLabel(potionName, students, slugsNeeded, fluxweedNeeded);

        System.out.println("Расчет для " + students
                + " порций отвара \"" + potionName
                + "\":\nНеобходимо сушеных пиявок: " + slugsNeeded
                + "\nНеобходимо пучков водорослей: " + fluxweedNeeded);
        System.out.println(label);
    }
}

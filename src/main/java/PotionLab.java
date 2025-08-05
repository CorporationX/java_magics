public class PotionLab {
    public static void main(String[] args) {
        int students = 16;
        String potion = "Оборотное зелье";
        PotionCalculator calculator = new PotionCalculator();

        int slugsNeeded = calculator.calculateNeededSlugs(students);
        int fluxWeedNeeded = calculator.calcculateNeededFluxweed(students);
        String label = calculator.getPotionLabel(potion, students, slugsNeeded, fluxWeedNeeded);

        System.out.println("Расчет для " + students + " порций " + potion + ":");
        System.out.println("Необходимо сушеных пиявок: " + slugsNeeded);
        System.out.println("Необходимо пучков водорослей: " + fluxWeedNeeded);
        System.out.println("Этикетка: " + label);

    }
}

public class QuidditchCompetition {
    public static void main(String[] args) {
        // Данные
        String name = "Гарри";
        int age = 13;
        boolean hasBroom = true;
        boolean passedMedicalCheck = true;
        int trainingSessionsAttended = 4;

        // Условия к допуску
        boolean canPlay = age > 11 && hasBroom && passedMedicalCheck && trainingSessionsAttended > 3;

        // Вывод
        if (canPlay == true) {
            System.out.println("Гарри допущен к матчу: " + canPlay);
        } else {
            System.out.println("Гарри допущен к матчу: " + canPlay);
        }

    }
}

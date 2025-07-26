public class QuidditchCompetition {
    public static void main(String[] args) {
        String name = "Гарри";
        int age = 13;
        boolean hasBroom = true;
        boolean passedMedicalCheck = true;
        int trainingSessionsAttended = 4;

        boolean canPlay = age > 11 && hasBroom && passedMedicalCheck && trainingSessionsAttended >= 3;
        System.out.println(name + " допущен к матчу: " + canPlay);
    }
}

public class QuidditchCompetition {
    public static void main(String[] args) {
        String name = "Гарри";
        int age = 10;
        boolean hasBroom = true;
        boolean passedMedicalCheck = true;
        int trainingSessionsAttended = 4;
        boolean canplay = age > 11 && hasBroom && passedMedicalCheck && trainingSessionsAttended >= 3;
        if (canplay == true) {
            System.out.println("Гарри допущен к матчу: " + canplay);
        } else {
            System.out.println("Гарри не допущен к матчу: " + canplay);
        }       
    }
}

public class QuidditchCompetition {
    public static void main(String[] args) {
        String name = "Гарри";
        int age = 13;
        boolean hasBroom = true;
        boolean passedMedicalCheck = true;
        int trainingSessionsAttended = 4;
        String qwerty = " допущен к матчу: "; //просто по приколу написал, можно было обойтись без этого

        boolean canPlay = (age > 11) && (hasBroom) && (passedMedicalCheck) && (trainingSessionsAttended >= 3);

        System.out.println(name + qwerty + canPlay);
    }
}

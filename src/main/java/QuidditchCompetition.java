public class QuidditchCompetition {
    public static void main(String[] args){
        String name = "Гарри Поттер";
        int age = 13;
        boolean hasBroom = true;
        boolean passedMedicalCheck = true;
        int trainingSessionsAttended = 4;
        boolean canPlay = false;
        if(age > 11 && hasBroom && passedMedicalCheck && trainingSessionsAttended > 3)
            canPlay = true;
        System.out.println(canPlay);
    }
}

package t44_46;

public class RemembrallTestMain {
    public static void main(String[] args) {
        RemembrallTest remembrallTest = new RemembrallTest();
        String wizardName = null; //"Гарри Поттер";
        int forgetfulnessLevel = 50;

        try {
            remembrallTest.testRemembrall(wizardName, forgetfulnessLevel);
        } catch (NullPointerException | IllegalArgumentException | RemembrallOverloadException e) {
            System.err.println(e.getMessage());
        }


    }
}

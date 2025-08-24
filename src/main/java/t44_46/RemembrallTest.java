package t44_46;

public class RemembrallTest  {
    public void testRemembrall(String wizardName, int forgetfulnessLevel) {
        if (wizardName == null) {
            throw new NullPointerException("Имя волшебника не может быть null!");
        }
        if (forgetfulnessLevel < 0 ) {
            throw new IllegalArgumentException("Уровень забывчивости не может быть отрицательным!");
        } else if (forgetfulnessLevel > 100) {
            throw new RemembrallOverloadException("Шар перегружен! Уровень забывчивости слишком высок: " + forgetfulnessLevel);
        } else {
            System.out.printf("Шар-Напоминалка для %s работает нормально.%n", wizardName);
        }

    }
}

package entity.basics_programming.exceptions.task45;

public class RemembrallTest {
    public static void testRemembrall(String wizardName, int forgetfulnessLevel){
        System.out.println("Тестируем шар для: " + wizardName + " (Уровень: " + forgetfulnessLevel + ")");
        if (wizardName == null) {
            throw new NullPointerException("Имя волшебника не может быть null!");
        }
        if (forgetfulnessLevel < 0) {
            throw new IllegalArgumentException("Уровень забывчивости не может быть отрицательным!");
        }
        if (forgetfulnessLevel > 100) {
            throw new RemembrallOverloadException("Шар перегружен! Уровень забывчивости слишком высок: " +  forgetfulnessLevel);
        }
        System.out.println("Шар-Напоминалка для " + wizardName + " работает нормально.\n");
    }
}

package entity.basics_programming.exceptions.task45;

import java.util.Random;

public class RemembrallTestMain {
    public static void main(String[] args) {
        String[] wizardNames = {"Рон", null, "Гермиона", "Гарри", "Фред", null};
        int[] forgetfulnessLevels = {-2, 23, 70, 0, 120, 101, -10};

        Random index = new Random(); // рандом для выбора волшебника и уровня заполненности шара
        String wizardName; // экземпляр массива имени волшебника для удобочитаемости кода
        int forgetfulnessLevel; // экземпляр массива уровня шара для удобочитаемости кода

        // проверяем вводные данные
        for (int step = 0; step < 10; step++) {
            wizardName = wizardNames[index.nextInt(wizardNames.length)];
            forgetfulnessLevel = forgetfulnessLevels[index.nextInt(forgetfulnessLevels.length)];

            try {
                RemembrallTest.testRemembrall(wizardName, forgetfulnessLevel);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (RemembrallOverloadException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

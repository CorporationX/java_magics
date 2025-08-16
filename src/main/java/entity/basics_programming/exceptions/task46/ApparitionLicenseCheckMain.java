package entity.basics_programming.exceptions.task46;

import java.time.LocalDate;
import java.util.Random;

import static entity.basics_programming.exceptions.task46.ApparitionLicenseCheck.checkApparitionReadiness;

public class ApparitionLicenseCheckMain {
    public static void main(String[] args) throws ApparitionLicenseExpiredException, InsufficientConcentrationException {
        LocalDate[] dates = {
                LocalDate.of(2020, 12, 3),
                LocalDate.of(2026, 10, 23),
                LocalDate.now(),
                LocalDate.of(2025, 8, 17),
                LocalDate.of(2022, 3, 15),
                LocalDate.of(2028, 12, 12)
        };
        int[] concentrationLevels = {12, 45, 70, 55, 1, 100, 60};

        Random index = new Random();
        int concentrationLevel; // для удобочитаемости

        // тестирование
        for (int step = 0; step < 10; step++) {
            LocalDate currentDate = dates[index.nextInt(dates.length)];
            concentrationLevel = concentrationLevels[index.nextInt(concentrationLevels.length)];
            try {
                checkApparitionReadiness(currentDate, concentrationLevel);
            } catch (ApparitionLicenseExpiredException | InsufficientConcentrationException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Проверяем дальше\n");
            }
        }
    }
}

package entity.basics_programming.exceptions.task46;

import java.time.LocalDate;

public class ApparitionLicenseCheck {
    public static void checkApparitionReadiness(LocalDate licenseExpiryDate, int concentrationLevel)
            throws ApparitionLicenseExpiredException, InsufficientConcentrationException {
        System.out.println("Проверяем лицензию: " + licenseExpiryDate + " и уровень доступа: " + concentrationLevel + " к трансгрессии");
        LocalDate currentDate = LocalDate.now();
        if (licenseExpiryDate.isBefore(currentDate)) {
            throw new ApparitionLicenseExpiredException("Срок лицензии на трансгрессию истек " + licenseExpiryDate);
        }
        if (concentrationLevel < 50) {
            throw new InsufficientConcentrationException("Недостаточный уровень концентрации для трансгрессии: " + concentrationLevel);
        }
        System.out.println("Волшебник готов к трансгрессии!");
    }
}

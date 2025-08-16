package entity.basics_programming.exceptions.task46;

import java.time.LocalDate;

public class ApparitionLicenseCheck {
    public static void checkApparitionReadiness(LocalDate licenseExpiryDate, int concentrationLevel)
            throws ApparitionLicenseExpiredException, InsufficientConcentrationException {
        System.out.println("Проверяем данные для трансгрессии: \nЛицензия до: " + licenseExpiryDate + ", уровень концентрации: " + concentrationLevel);
        LocalDate currentDate = LocalDate.now();
        if (licenseExpiryDate == null){
            throw new NullPointerException("Дата окончания лицензии не указана!");
        }
        if (licenseExpiryDate.isBefore(currentDate)) {
            throw new ApparitionLicenseExpiredException("Срок лицензии на трансгрессию истек " + licenseExpiryDate);
        }
        if (concentrationLevel < 50) {
            throw new InsufficientConcentrationException("Недостаточный уровень концентрации для трансгрессии: " + concentrationLevel);
        }
        System.out.println("Волшебник готов к трансгрессии!");
    }
}

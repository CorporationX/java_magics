package t44_46;

import java.time.LocalDate;

public class ApparitionLicenseCheck {
    public static void checkApparitionReadiness(LocalDate licenseExpiryDate, int concentrationLevel)
            throws ApparitionLicenseExpiredException, InsufficientConcentrationException {
        LocalDate today = LocalDate.now();
        if (licenseExpiryDate.isBefore(today)) {
            throw new ApparitionLicenseExpiredException("Срок лицензии на трансгрессию истек " + licenseExpiryDate);
        }
        if (concentrationLevel < 50) {
            throw new InsufficientConcentrationException("Недостаточный уровень концентрации для трансгрессии: " + concentrationLevel);
        }
        System.out.println("Волшебник готов к трансгрессии!");
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024,2,10);
        LocalDate date2 = LocalDate.of(2026,2,10);

        try {
            checkApparitionReadiness(date1, 100);
        } catch (ApparitionLicenseExpiredException | InsufficientConcentrationException e) {
            System.err.println(e.getMessage());
        }

        try {
            checkApparitionReadiness(date2, 100);
        } catch (ApparitionLicenseExpiredException | InsufficientConcentrationException e) {
            System.err.println(e.getMessage());
        }

        try {
            checkApparitionReadiness(date2, 10);
        } catch (ApparitionLicenseExpiredException | InsufficientConcentrationException e) {
            System.err.println(e.getMessage());
        }
    }
}

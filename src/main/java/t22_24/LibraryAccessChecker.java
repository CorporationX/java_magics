package t22_24;

public class LibraryAccessChecker {
    private boolean hasPermissionSlip(String studentName) {
        boolean hasSlip = studentName.equals("Гермиона Грейнджер");

        System.out.println("Проверяем специальное разрешение...");
        if (hasSlip) {
            System.out.println("Доступ разрешен по специальному разрешению!");
        } else {
            System.out.println("Специального разрешения нет, увы...");
        }
        return hasSlip;
    }

    public boolean checkLibraryAccess(String studentName, int year) {
        if (year >= 4) {
            System.out.println("Доступ разрешен по курсу");
            return true;
        } else {
            System.out.println("Доступ по курсу запрещен. Проверка специального разрешения");
            return this.hasPermissionSlip(studentName);
        }
    }

}

public class LibraryAccessChecker {
    private boolean hasPermissionSlip(String studentName) {
        boolean hasSlep = studentName.equals("Гермиона Грейнджер");
        if (hasSlep) {
            System.out.println("(Проверка: у " + studentName + " есть пропуск)");
        } else {
            System.out.println("(Проверка: у " + studentName + " нет разрешения)");
        }
        return hasSlep;
    }

    public boolean checkLibraryAccess(String studentName, int year) {
        System.out.println("\nПроверен студент: " + studentName + ", Курс: " + year);

        if (year >= 4) {
            System.out.println(" -> Доступ разрешён по курсу.");
            return true;
        }
        System.out.println(" -> Курс ниже 4, проверяем  разрешение.");
        boolean hasPermission = hasPermissionSlip(studentName);
        if (hasPermission) {
            System.out.println(" -> Доступ разрешён по разрешению.");
        } else {
            System.out.println(" -> Доступ запрещён.");
        }
        return hasPermission;
    }
}

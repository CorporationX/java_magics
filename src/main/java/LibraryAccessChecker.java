public class LibraryAccessChecker {
    private boolean hasPermissionSlip(String studentName) {
        boolean hasSlip = studentName.equals("Гермиона Грейнджер");
        if (hasSlip) {
            System.out.println("   (Проверка: у " + studentName + " есть разрешение!)");
        } else {
            System.out.println("   (Проверка: у " + studentName + " нет разрешения.)");
        }
        return hasSlip;
    }
    public boolean checkLibraryAccess(String studentName, int year) {
        if (year >= 4) {
            System.out.println("Доступ разрешен по курсу");
            return true;
        } else {
            boolean hasPermission = this.hasPermissionSlip(studentName);
            if (hasPermission) {
                System.out.println("   (Проверка: у " + studentName + " есть разрешение!)");
            } else {
                System.out.println("   (Проверка: у " + studentName + " нет разрешения.)");
            }
            return hasPermission;
        }
    }
}

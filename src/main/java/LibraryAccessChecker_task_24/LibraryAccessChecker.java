package LibraryAccessChecker_task_24;

public class LibraryAccessChecker {
    private boolean hasPermissionSlip(String studentName){
        boolean isPermission = studentName.equals("Гермиона");

        if (isPermission) {
            System.out.println("У студента " + studentName + " есть допуск");
        } else {
            System.out.println("У студента " + studentName + " ytn допускf");
        }
        return isPermission;
    }
    public boolean checkLibraryAccess(String studentName, int year){
        System.out.println("\nНачинается проверка " + studentName + " на допуск");

        if (year >= 4) {
            System.out.println("Доступ разрешен на основании курса");
            return true;
        } 
        System.out.println("Курс ниже 4, проверяем допуск");
        boolean hasPermission = this.hasPermissionSlip(studentName);
        if (hasPermission) {
            System.out.println("Доступ разрещен");
        } else {
            System.out.println("Доступ запрещен");
        }
        return hasPermission;
    }
}
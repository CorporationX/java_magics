public class LibraryAccessChecker {
    // Создаем приватный метод для проверки
    private boolean hasPermissionSlip(String studentName) {
        boolean hasSlip = studentName.equals("Гермиона Грейнджер");
        if (hasSlip) {
            System.out.println("Проверка... у " + studentName + " есть разрешение!");
        } else {
            System.out.println("Проверка... у " + studentName + " нет разрешения!");
        }
        return hasSlip;
    }

    // Публичный метод для проверки
    public boolean checkLibraryAccess(String studentName, int year) {
        System.out.println("Проверяем студента: " + studentName + ", Курс:" + year);
        if (year >= 4) {
            System.out.println("Доступ разрешен по курсу.");
            return true;
        }

        // Если студент не прошел проверку по курсу
        System.out.println("Курс ниже 4, проверяем разрешение...");
        boolean hasPermission = this.hasPermissionSlip(studentName);

        //Возвращаем результат проверки
        if (hasPermission) {
            System.out.println("Доступ разрешен по разрешению.");
        } else {
            System.out.println("Доступ запрещен");
        }
        return hasPermission;
    }
}


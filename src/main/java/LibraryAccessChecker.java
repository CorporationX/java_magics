public class LibraryAccessChecker {
    private String studentName;
    private int year;

    private boolean hasPermissionSlip(String studentName) {
        return studentName.equals("Гермиона Грейнджер");
    }

    public boolean checkLibraryAccess(String studentName, int year) {
        this.studentName = studentName;
        this.year = year;
        if (year >= 4) return true;
        else return hasPermissionSlip(studentName);
    }

    void printAccess() {
        System.out.println("Проверяем студента: " + this.studentName + ", Курс: " + this.year);
        if (this.year >= 4) {
            System.out.println("Доступ разрешен по курсу.");
        } else {
            System.out.print("-> Курс ниже 4, проверяем разрешение...\n(Проверка: у ");
            if (checkLibraryAccess(this.studentName, this.year))
                System.out.println(studentName + " есть разрешение!)\n"
                        + "-> Доступ разрешен по разрешению.");
            else {
                System.out.println(studentName + " нет разрешения.)\n"
                        + "-> Доступ запрещен.");
            }
        }
        System.out.println("Итог: Доступ для " + this.studentName + " (" + year + " курс): "
                + checkLibraryAccess(this.studentName, this.year) + "\n");
    }
}

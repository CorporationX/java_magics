public class LibraryEntrance {
    public static void main(String[] args) {
        LibraryAccessChecker checker = new LibraryAccessChecker();
        boolean accessHarry = checker.checkLibraryAccess("Гарри Поттер", 3);
        System.out.println("Итог: Доступ для Гарри Поттер (3 курс): " + accessHarry);

        boolean accessHermione = checker.checkLibraryAccess("Гермиона Грейнджер", 3);
        System.out.println("Итог: Доступ для Гермиона Грейнджер (3 курс): " + accessHermione);

        boolean accessCedric = checker.checkLibraryAccess("Седрик", 4);
        System.out.println("Итог: Доступ для Седрик (4 курс): " + accessCedric);
    }
}

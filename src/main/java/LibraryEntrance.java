public class LibraryEntrance {
    public static void main(String[] args) {
        System.out.println("Проверка доступа в Запретную Секцию...");

        LibraryAccessChecker checker = new LibraryAccessChecker();

        boolean accessHarry = checker.checkLibraryAccess("Гарри Поттер", 3);
        System.out.println("Итог: Доступ для Гарри Поттер (3 курс): " + accessHarry);

        boolean accessHermione = checker.checkLibraryAccess("Гермиона Грейнджер", 3);
        System.out.println("Итог: Доступ для Гермиона Грейнджер (3 курс): " + accessHermione);

        boolean accessCedric = checker.checkLibraryAccess("Седрик Диггори", 4);
        System.out.println("Итог: Доступ для Седрик Диггори (4 курс): " + accessCedric);
    }
}

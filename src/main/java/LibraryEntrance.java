public class LibraryEntrance {
    public static void main(String[] args) {
        System.out.println("Проверка доступа в Запретную Секцию...");

        // Объект проверяющий студента
        LibraryAccessChecker checker = new LibraryAccessChecker();

        // Проверяем доступ у студентов
        boolean accessHarry = checker.checkLibraryAccess("Гарри Поттер", 3);
        System.out.println("Итог для Гарри Поттера, 3 курс: " + accessHarry);

        boolean accessHermione = checker.checkLibraryAccess("Гермиона Грейнджер", 3);
        System.out.println("Итог для Гермионы Грейнджер, 3 курс" + accessHermione);

        boolean accessCedric = checker.checkLibraryAccess("Седрик Диггори", 4);
        System.out.println("Итог для Седрика Диггори, 4 курс" + accessCedric);
    }
}

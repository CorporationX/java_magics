package t22_24;

public class LibraryEntrance {
    public static void main(String[] args) {
        String harry = "Гарри Поттер";
        String germiona ="Гермиона Грейнджер";
        String sedrik = "Седрик";

        LibraryAccessChecker checker = new LibraryAccessChecker();
        boolean accessHarry = checker.checkLibraryAccess(harry, 3);
        System.out.println("Доступ для Гарри " + accessHarry);

        boolean accessGermiona = checker.checkLibraryAccess(germiona, 3);
        System.out.println("Доступ для Гермионы " + accessGermiona);

        boolean accessSedrik = checker.checkLibraryAccess(sedrik, 4);
        System.out.println("Доступ для Седрик " + accessSedrik);

    }
}

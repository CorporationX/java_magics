package LibraryAccessChecker_task_24;

public class LibraryEntrance {
    public static void main(String[] args) {
        System.out.println("Начинаем проверку на допуск");

        LibraryAccessChecker cheker = new LibraryAccessChecker();

        boolean admissionHarry = cheker.checkLibraryAccess("гарри", 3);
        System.out.println("\nДопуск гарри 3 курс " + admissionHarry);

        boolean admissionHermiona = cheker.checkLibraryAccess("Гермиона", 3);
        System.out.println("\nДопуск гермионы 3 курс " + admissionHermiona);

        boolean admissionCedric = cheker.checkLibraryAccess("Седрик", 4);
        System.out.println("\nДопуск седрика 4 курс " + admissionCedric);
    }
}
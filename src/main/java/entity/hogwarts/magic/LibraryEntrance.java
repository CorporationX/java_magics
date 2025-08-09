package entity.hogwarts.magic;

public class LibraryEntrance {
    public static void main(String[] args) {
        LibraryAccessChecker libraryAccessChecker = new LibraryAccessChecker();

        System.out.println("Проверка доступа в Запретную Секцию...\n");

        libraryAccessChecker.checkLibraryAccess("Гарри Поттер", 3);
        libraryAccessChecker.printAccess();
        libraryAccessChecker.checkLibraryAccess("Гермиона Грейнджер", 3);
        libraryAccessChecker.printAccess();

        boolean checkSedrik = libraryAccessChecker.checkLibraryAccess("Седрик Диггори", 4);
        System.out.println(checkSedrik); // Проверка доступа на печать
        libraryAccessChecker.printAccess();
    }


}

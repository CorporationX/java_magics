public class FacultyMain {
    public static void main(String[] args) {
//        Создайте несколько факультетов (например, Гриффиндор и Слизерин).
//        Проведите несколько событий: например, Гриффиндор получает 20 очков,
//         Слизерин получает 50 очков, затем Гриффиндор получает штраф и т.д.
//        Выведите информацию о факультетах
//        Определите, какой из факультетов лидирует.
        Faculty griffindor = new Faculty("Гриффиндор");
        Faculty slizerin = new Faculty("Слизерин", 5);

        griffindor.addPoints(25);
        slizerin.addPoints(50);
        griffindor.addPenalty();
        slizerin.addPenalty();
        griffindor.addPoints(50);
        griffindor.addPenalty();
        slizerin.addPoints(10);

        griffindor.printInfo();
        slizerin.printInfo();

        Faculty.printLeader(griffindor, slizerin);

        // тестируем дальше
        System.out.println();

        slizerin.addPoints(10);
        griffindor.addPenalty();

        griffindor.printInfo();
        slizerin.printInfo();
        Faculty.printLeader(slizerin, griffindor);


        // тест 3 (ничья)
        System.out.println();

        griffindor.addPoints(10);

        griffindor.printInfo();
        slizerin.printInfo();
        Faculty.printLeader(slizerin, griffindor);
    }
}

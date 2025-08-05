public class FacultyMain {
    public static void main(String[] args) {
        Faculty griffindor = new Faculty("Гриффиндор", 10);
        Faculty slizerin = new Faculty("Слизерин");

        griffindor.addPoints(12);
        slizerin.addPoints(20);

        slizerin.addPenalty();
        griffindor.addPenalty();

        griffindor.printInfo();
        slizerin.printInfo();

        String leader = griffindor.name;
        if (!griffindor.isLeader(slizerin)) {
            leader = slizerin.name;
        }
        System.out.println("Лидирует: " + leader);

    }
}

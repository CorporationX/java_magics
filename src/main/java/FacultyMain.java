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

        String leader = slizerin.name;
        if (griffindor.isLeader(slizerin)) {
            leader = griffindor.name;
        }
        System.out.println("Лидирует: " + leader);

    }
}

public class FacultyMain {
    public static void main(String[] args) {
        Faculty gryffindor = new Faculty("Гриффиндор");
        Faculty slytherin = new Faculty("Слизерин");

        gryffindor.addPoints(20);
        slytherin.addPoints(50);
        gryffindor.addPenalty();
        gryffindor.addPoints(105);
        slytherin.addPenalty();
        slytherin.addPoints(67);

        gryffindor.printInfo();
        slytherin.printInfo();

        if (gryffindor.isLeader(slytherin)) {
            System.out.println("Лидирует: " + gryffindor.name);
        } else if (slytherin.isLeader(gryffindor)) {
            System.out.println("Лидирует: " + slytherin.name);
        } else {
            System.out.println("Ничья между факультетами.");
        }
    }
}
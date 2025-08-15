public class FacultyMain {
    public static void main(String[] args) {
        Faculty Gryffindor = new Faculty("Гарри");
        Faculty Slytherin = new Faculty("Драко", 20);

        Gryffindor.addPoints(50);
        Slytherin.addPoints(50);
        Gryffindor.addPenalty();

        Gryffindor.printInfo();
        Slytherin.printInfo();

        if (Gryffindor.isLeader(Slytherin)) {
            System.out.println("Гриффиндор впереди!");
        } else if (Slytherin.isLeader(Gryffindor)) {
            System.out.println("Слиззерин впереди!");
        } else {
            System.out.println("Ничья!");
        }
    }
}

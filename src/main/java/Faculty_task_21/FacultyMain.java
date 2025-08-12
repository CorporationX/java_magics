package faculty_task_21;
public class FacultyMain {
    public static void main(String[] args) {
        
        Faculty grifindor = new Faculty("Гриффиндор");

        Faculty slizerin = new Faculty("Слизерин");

        grifindor.addPoints(20);
        slizerin.addPoints(50);
        grifindor.addPenalty();
        grifindor.addPoints(50);
        slizerin.addPenalty();

        grifindor.printInfo();
        slizerin.printInfo();

        if (slizerin.isLeader(grifindor)) {
            System.out.println("\nЛидирует: " + slizerin.name);
        } else if (grifindor.isLeader(slizerin)){
            System.out.println("\nЛидирует: " + grifindor.name);
        } else{
            System.out.println("\nНичья");
        }
    }
}

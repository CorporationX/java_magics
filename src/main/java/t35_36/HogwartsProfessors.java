package t35_36;

public class HogwartsProfessors {
    public static void main(String[] args) {
        Professor[] professors = {
            new Snape(),
            new McGonagall(),
            new Lupin(),
        };

        for (Professor professor : professors) {
            professor.introduce();
            professor.teach();

        }
    }
}

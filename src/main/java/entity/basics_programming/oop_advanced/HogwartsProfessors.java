package entity.basics_programming.oop_advanced;

public class HogwartsProfessors {
    public static void main(String[] args) {
        // создаем преподавателей
        Professor[] professors = {
                new Snape(),
                new McGonagall(),
                new Lupin()
        };

        // Вывод на печать
        for (Professor professor : professors) {
            professor.introduce();
            professor.teach();
            System.out.println();
        }
    }
}

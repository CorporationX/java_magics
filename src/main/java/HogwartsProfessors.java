public class HogwartsProfessors {
    public static void main(String[] args) {
        // Создаём массив преподавателей
        Professor[] professors = {
            new Snape(),
            new McGonagall(),
            new Lupin()
        };

        // Вызываем их методы
        for (Professor professor : professors) {
            professor.introduce();
            professor.teach();
            System.out.println();
        }
    }
}


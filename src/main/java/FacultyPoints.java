public class FacultyPoints {
    public static void main(String[] args) {
        int gryffindorPoints = 150; // Изначальное количество
        gryffindorPoints += 20; //Гарри и Рон заработали
        gryffindorPoints += 10; // Гермиона ответила на вопрос в классе
        gryffindorPoints -= 30; // Малфой устроил драку
        gryffindorPoints += 50; // Гарри помог поймать тролля
        gryffindorPoints -= 1; // Ошибка преподавателя

        // Вывод
        System.out.println("Итоговые баллы факультета Гриффиндор:"+gryffindorPoints);
    }
}

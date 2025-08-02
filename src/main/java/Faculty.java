public class Faculty {
    String name;   // название факультета
    int points;    // текущее количество очков
    int penalties; // количество штрафов

    public Faculty(String name) {
        this.name = name;
        this.points = 0;
        this.penalties = 0;
    }

    public Faculty(String name, int points) {
        this.name = name;
        this.points = points;
        this.penalties = 0;
    }

    // прибавляет очки
    void addPoints(int value) {
        this.points += value;
    }

    // увеличивает счётчик штрафов на 1 и отнимает 5 очков.
    void addPenalty() {
        this.penalties++;
        this.points -= 5;
    }

    // печатает название факультета, очки и количество штрафов.
    void printInfo() {
        System.out.println("Факультет: " + name
                + "\nОчки: " + points
                + "\nШтрафы: " + penalties + "\n");
    }

    // возвращает true, если текущий факультет лидирует по очкам над переданным факультетом.
    boolean isLeader(Faculty other) {
        return this.points > other.points;
    }

    static void leader(Faculty faculty1, Faculty faculty2) {
        String result = faculty1.isLeader(faculty2) ? faculty1.name : faculty2.name;
        System.out.println("Лидирует: " + result);
    }
}

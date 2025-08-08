public class Faculty {
    String name;
    int points;
    int penalties;

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

    void addPoints(int value) {
        this.points += value;
    }

    void addPenalty() {
        this.penalties++;
        this.points -= 5;
    }

    void printInfo() {
        System.out.println("Факультет: " + this.name);
        System.out.println("Очки: " + this.points);
        System.out.println("Штрафы: " + this.penalties + "\n");
    }

    boolean isLeader(Faculty other) {
        return this.points > other.points;
    }
}

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

    public void addPoints(int value) {
        this.points += value;
    }

    public void addPenalty() {
        this.penalties++;
        this.points -= 5;
    }

    public void printInfo() {
        System.out.println("\nФакультет: " + this.name + "\n" + "Количество очков " + this.points + "\n"
                + "Штрафы: " + this.penalties);
    }

    public boolean isLeader(Faculty other) {
        return this.points > other.points;
    }
}


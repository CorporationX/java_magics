public class Faculty {
    public String name;
    public int points;
    public int penalties;

    Faculty(String name) {
        this.name =name;
        this.points = 0;
        this.penalties = 0;
    }

    Faculty(String name, int points) {
        this.name =name;
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
        System.out.println("Факультет: " + name);
        System.out.println("Очки: " + points);
        System.out.println("Количество штрафов: " + penalties);
        System.out.println();
    }

    public boolean isLeader(Faculty other) {
        return this.points > other.points;
    }

    //Эту часть мне прописала сама IJ
    public String Name() {
    return name;
    }
}
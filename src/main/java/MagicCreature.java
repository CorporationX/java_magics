public class MagicCreature {
    private String name;
    private int health;
    private int mood;

    private int clamp(int value) {
        if (value < 0 ) return 0;
        if (value > 100) return  100;
        return value;
    }

    public MagicCreature(String name, int health, int mood) {
        this.name = name;
        this.health = clamp(health);
        this.mood = clamp(mood);
    }

    public void feed(int food) {
    int healthDelta = food / 2;
    int moodDelta = food / 3;
    changeHealth(healthDelta);
    changeMood(moodDelta);
    }

    public void play() {
        changeMood(10);
        changeHealth(-5);
    }

    public void printStatus() {
        System.out.println("Существо: " + name);
        System.out.println("Здоровье: " + health);
        System.out.println("Настроение: " + mood);
        System.out.println("Состояние: " + getMoodDescription());
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMood() {
        return mood;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void changeHealth(int delta) {
        this.health = clamp(this.health + delta);
    }

    private void changeMood(int delta) {
        this.mood = clamp(this.mood + delta);
    }

    private String getMoodDescription() {
        if (mood > 70) {
            return "Счастливое";
        } else if (mood < 30) {
            return "Злое";
        } else {
            return "Грустное";
        }
    }
}

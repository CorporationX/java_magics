public class MagicCreature {
    private final String name;
    private int mood; // по умолчанию
    private int health; // по умолчанию

    public MagicCreature(String name, int mood, int health) {
        this.name = name;
        setMood(mood);
        setHealth(health);
    }

    public String getName() {
        return name;
    }
    public int getMood() {
        return mood;
    }
    public int getHealth() {
        return health;
    }

    // Сеттеры с проверкой диапазона
    private void setMood(int mood) {
        if (mood > 100) {
            this.mood = 100;
        } else if (mood < 0) {
            this.mood = 0;
        } else {
            this.mood = mood;
        }
    }

    private void setHealth(int health) {
        if (health > 100) {
            this.health = 100;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }
    // Вместо changeMood and changeHealth использовал сеттеры
    public void feed(int food) {
        setHealth(health += food / 2);
        setMood(mood + food / 3);
    }

    public void play() {
        setHealth(health -= 5);
        setMood(mood += 10);
    }


    public void printStatus() {
        System.out.println("Имя: " + name);
        System.out.println("Здоровье: " + health);
        System.out.println("Настроение: " + mood);
        System.out.println("Состояние: " + getMoodDescription());
    }

    public String getMoodDescription() {
        if (mood > 70) {
            return "Счастливое";
        } else if (mood < 30) {
            return "Злое";
        } else {
            return "Грустное";
        }
    }
}

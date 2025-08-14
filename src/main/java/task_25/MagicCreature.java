package task_25;

public class MagicCreature {
    private String name;
    private int health;
    private int mood;

    public MagicCreature(String name, int health, int mood) {
        this.name = name;

        if (health < 0 || health > 100) {
            System.out.println("Введено некорректное значение здоровья. Установлено: 80");
            this.health = 80;
        } else {
            this.health = health;
        }

        if (mood < 0 || mood > 100) {
            System.out.println("Введено некорректное значение настроения. Установлено: 25");
            this.mood = 25;
        } else {
            this.mood = mood;
        }
    }

    // Эти 2 геттера здесь добавлены для читаемости, но смысловой нагрузки в них нет.
    // Они ничего не проверяют. Можно напрямую обратиться к private-переменным из других private-методов.
    private int getHealth() {
        return health;
    }

    private int getMood() {
        return mood;
    }

    public void feed(int food) {
        if (food < 1 ) {
            System.out.println("Нельзя отбирать еду у " + this.name + ". Задайте положительное число");
            return;
        }
        System.out.println("Вы покормили " + this.name);
        changeHealth(food / 2);
        changeMood(food / 3);
    }

    public void play() {
        System.out.println("Вы поиграли с " + this.name);
        changeHealth(-5);
        changeMood(10);
    }

    private void changeHealth(int delta) {
        this.health+= delta;
        if (this.health < 1 ) {
            System.out.println("Здоровье не может быть равно или меньше нуля. Установлено: 1");
            this.health = 1;
        } else if (this.health > 100) {
            System.out.println("Здоровье не может быть больше 100. Установлено: 100");
            this.health = 100;
        }
    }

    private void changeMood(int delta) {
        this.mood+= delta;
        if (this.mood < 0 ) {
            // Проверку на this.mood < 0 можно убрать, т.к. public методами настроение только увеличивается.
            System.out.println("Настроение не может стать отрицательным. Установлено: 0");
            this.mood = 0;
        } else if (this.mood > 100) {
            System.out.println("Настроение не может быть больше 100. Установлено: 100");
            this.mood = 100;
        }
    }

    private String getMoodDescription() {
        String resultMood;
        if (this.mood > 70) {
            resultMood = "Счастливое";
        } else if (this.mood >= 30) {
            resultMood = "Грустное";
        } else {
            resultMood = "Злое";
        }
        return resultMood;
    }

    public void printStatus() {
        System.out.println("Существо: " + this.name);
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Настроение: " + getMood());
        System.out.println("Состояние: " + getMoodDescription() + "\n");
    }
}

public class MagicCreature {
    private String name; // имя существа
    private int health;  // здоровье (от 0 до 100)
    private int mood;    // настроение (от 0 до 100)

    // Конструктор со всеми полями
    public MagicCreature(String name, int health, int mood) {
        this.name = name;
        this.health = health;
        this.mood = mood;
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

    // покормить существо (повышает здоровье на food / 2 и настроение на food / 3)
    void feed(int food) {
        if (health == 100 && mood == 100) {
            System.out.println("Можно больше не кормить!");
            return;
        }
        System.out.println("Вы покормили " + this.name);
        changeHealth(food / 2);
        changeMood(food / 3);
    }

    // поиграть с существом (повышает настроение на 10, но снижает здоровье на 5, т.к. существо устает)
    void play() {
        if (this.health == 0) {
            System.out.println(this.name + " Играть больше не может, здоровье на 0..");
            return;
        }
        System.out.println("Вы поиграли с " + this.name);
        changeMood(10);
        changeHealth(-5);
    }

    // Напугать существо (ухудшает настроение на 15)
    void scare() {
        if (this.mood == 0) {
            System.out.println("Бесполезно пугать уже максимально агрессивного зверя. Вам бы ноги от сюда унести поскорее!");
            return;
        }
        System.out.println("Вы напугали " + this.name);
        changeMood(-15);
    }

    // изменяет здоровье, гарантируя диапазон 0–100.
    private void changeHealth(int delta) {
        this.health += delta;

        if (this.health > 100) {
            this.health = 100;
            System.out.println("У " + this.name + " здоровье на максимуме");
        }

        if (this.health >= 5 && this.health <= 15)
            System.out.println("Здоровье меньше 15, есть риск потерять " + this.name);

        if (this.health < 0) {
            this.health = 0;
            System.out.println("Здоровье " + this.name + " подошло к 0..");
        }
    }

    // изменяет настроение, гарантируя диапазон 0–100.
    private void changeMood(int delta) {
        this.mood += delta;

        if (this.mood > 100) {
            this.mood = 100;
            System.out.println(this.name + " в наилучшем настроении");
        }

        if (this.mood < 0) {
            this.mood = 0;
            System.out.println(this.name + " в наихудшем настроении");
        }
    }

    // выводит информацию о существе: имя, здоровье, настроение,
    //  текущее состояние («Счастливое» / «Грустное» / «Злое»).
    void printStatus() {
        System.out.println("\nСущество: " + this.name
                + "\nЗдоровье: " + this.health
                + "\nНастроение: " + this.mood
                + "\nСостояние: " + getMoodDescription() + "\n");
    }

    // возвращает описание состояния существа на основе настроения:
    //  больше 70 — счастливое, меньше 30 — злое, от 30 до 70 — грустное.
    String getMoodDescription() {
        if (mood > 70) return "Счастливое";
        else if (mood < 30) return "Злое";
        else return "Грустное";
    }
}

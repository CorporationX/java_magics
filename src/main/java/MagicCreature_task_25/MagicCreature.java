package MagicCreature_task_25;

public class MagicCreature {
    private final String name;
    private int health;
    private int mood;
    
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
    public void feed(int food) {
        changeHealth(food / 2);
        changeMood(food / 3);
    }

    public void play() {
        changeMood(10);
        changeHealth(-5);
    }
    public void changeHealth(int delta){
        health += delta;
        if (health > 100) {
            health = 100;
        } else if (health < 0){
            health = 0;
        }
    }  
    public void changeMood(int delta){
        mood += delta;
        if (mood > 100) {
            mood = 100;
        } else if (mood < 0){
            mood = 0;
        }
    }   
    public String getMoodDescription(){
        if (mood > 70) {
            return "Счастливое";
        } else if (mood < 30) {
            return "Злое";
        } else{
            return "Грустное";
        }
    }
    public void printStatus(){
        System.out.println("Имя: " + name +
                            "\nЗдоровье: " + health +
                            "\nНастроение: " + mood +
                            "\nСостояние: " + getMoodDescription());
    }
} 

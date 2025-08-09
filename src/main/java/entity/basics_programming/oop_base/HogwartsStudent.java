package entity.basics_programming.oop_base;

public class HogwartsStudent {
    private String name;
    private int age;
    private Wand wand;

    public int getAge() {
        return age;
    }

    public Wand getWand() {
        return wand;
    }

    public String getName() {
        return name;
    }

    // Конструктор со всеми полями
    public HogwartsStudent(String name, int age, Wand wand) {
        this.name = name;
        this.age = age;
        this.wand = wand;
    }

    // Конструктор без палочки
    public HogwartsStudent(String name, int age) {
        this.name = name;
        this.age = age;
        this.wand = null;
    }
}

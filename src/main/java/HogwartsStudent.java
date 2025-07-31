public class HogwartsStudent {
    String name;
    int age;
    Wand wand;

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

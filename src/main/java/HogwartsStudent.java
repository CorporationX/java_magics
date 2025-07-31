public class HogwartsStudent {
    String name;
    int age;
    Wand wand;

    public HogwartsStudent(String name, int age, Wand wand) {
        this.name = name;
        this.age = age;
        this.wand = wand;
    }

    public HogwartsStudent(String name, int age) {
        this.name = name;
        this.age = age;
        this.wand = null;
    }
}

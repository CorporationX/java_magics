public class HogwartsStudent {
    String name;
    int age;
    Wand wand;

    HogwartsStudent(String name, int age, Wand wand) {
        this.name = name;
        this.age = age;
        this.wand = wand;
    }

    HogwartsStudent(String name, int age) {
        this.name = name;
        this.age = age;
        this.wand = null;
    }
}

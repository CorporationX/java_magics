package entity.basics_programming.oop_base;

public class HogwartsStudentMain {
    public static void main(String[] args) {
        Wand harryWand = new Wand("Тис", "Перо феникса", 34);
        HogwartsStudent harry = new HogwartsStudent("Гарри Поттер", 11, harryWand);
        System.out.println("Ученик: " + harry.getName() + ", возраст: " + harry.getAge() + ", палочка: " + harry.getWand().woodType);

        HogwartsStudent tom = new HogwartsStudent("Том Реддл", 16);
        System.out.println("Ученик: " + tom.getName() + ", возраст: " + tom.getAge() + ", палочка: нет");
    }
}

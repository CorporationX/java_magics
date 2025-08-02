public class HogwartsStudentMain {
    public static void main(String[] args) {
        Wand harryWand = new Wand("Тис", "Перо феникса", 34);

        HogwartsStudent harry = new HogwartsStudent("Гарри Поттер", 11, harryWand);
        HogwartsStudent tom = new HogwartsStudent("Том Реддл", 16);

        System.out.println("Ученик: " + harry.name + ", возраст: " + harry.age + ", палочка: " + harry.wand.woodType);
        System.out.println("Ученик: " + tom.name + ", возраст: " + tom.age + ", палочка: нет");
    }
}

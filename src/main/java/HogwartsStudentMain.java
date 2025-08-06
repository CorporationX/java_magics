public class HogwartsStudentMain {
    public static void main(String[] args) {
        Wand harryWand = new Wand("tree", "zub", 37);
        HogwartsStudent harry = new HogwartsStudent("harry", 19, harryWand); 
        System.out.println("Ученик: " + harry.name + ", возраст: " + harry.age + ", палочка: " + harry.wand.woodType);
        HogwartsStudent ron = new HogwartsStudent("ron", 20);
        System.out.println("Ученик: " + ron.name + ", возраст: " + ron.age + ", палочка: нет");
    }
}

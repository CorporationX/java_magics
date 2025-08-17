Class Wand {
String woodType;
String core;
int length;

//Конструктор
Wand(String woodType, String core, int length) {
    this.woodType = woodType;
    this.core = core;
    this.length = length;
}
}

public class WandMain  {
    public static void main(String[] args) {
        Wand wand1 = new Wand("Бузина", "Волос фестрала", 38);
        System.out.println("Палочка 1" + wand1.woodType + ", ядро" + wand1.core + ", длина" + wand1.length + "см.");
        Wand wand2 = new Wand("Вяз", "Сердечная жила дракона", 45);
        System.out.println("Палочка 2" + wand2.woodType +", ядро" + wand2.core + ", длина"+wand2.length + "см.");
    }
}
Class HogwartsStudent {
String name;
int age;
Wand wand;
}

// Конструктор с палочкой
HogwartsStudent(String name, int age, Wand wand) {
    this.name = name;
    this.age = age;
    this.wand = wand;
}

// Коснтруктор без палочки
HogwartsStudent(String name, int age, Wand wand) {
    this.name = name;
    this.age = age;
    this.wand = null;
}


public class HogwartsStudentMain {
    public static void main(String[] args) {
        Wand lunaWand = ("Дуб", "Волос единорога", 30);
        HogwartsStudent luna = new HogwartsStudent("Луна Лавгуд", "11", lunawand);
        System.out.println("Ученик 1:" + luna.name + ", возраст" + luna.age + "лет" + "Палочка: " + lunaWand);

        HogwartsStudent ron = new HogwartsStudent("Рон Уизли", "11");
        System.out.println("Ученик 2" + ron.name + ", возраст: " + ron.age + "лет" + ", палочка: нет.");

    }

}

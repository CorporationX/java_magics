class Wand {
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

class WandMain  {
    public static void main(String[] args) {
        Wand wand1 = new Wand("Бузина", "Волос фестрала", 38);
        System.out.println("Палочка 1: " + wand1.woodType + ", ядро " + wand1.core + ", длина " + wand1.length + "см.");
        Wand wand2 = new Wand("Вяз", "Сердечная жила дракона", 45);
        System.out.println("Палочка 2: " + wand2.woodType +", ядро " + wand2.core + ", длина "+wand2.length + "см.");
    }
}


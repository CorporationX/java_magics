package oop_java.t16;

public class t16_Wand {
    static class Wand {
        String woodType;
        String core;
        int length;

        // Конструктор
        Wand(String woodType, String core, int length) {
            this.woodType = woodType;
            this.core = core;
            this.length = length;
        }
    }

    public static void main(String[] args) {
        Wand wand1 = new Wand("Тис", "Перо феникса", 34);
        System.out.println("Палочка 1: " + wand1.woodType + ", ядро: " + wand1.core + ", длина: " + wand1.length + " см");

        Wand wand2 = new Wand("Ясень", "Волос единорога", 30);
        System.out.println("Палочка 2: " + wand2.woodType + ", ядро: " + wand2.core + ", длина: " + wand2.length + " см");
    }
}

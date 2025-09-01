package oop_java.t16;

public class t16_Wand1 {
    public static void main(String[] args) {
        t16_Wand.Wand wand1 = new t16_Wand.Wand("Тис", "Перо феникса", 34);
        System.out.println("Палочка 1: " + wand1.woodType + ", ядро: " + wand1.core + ", длина: " + wand1.length + " см");

        t16_Wand.Wand wand2 = new t16_Wand.Wand("Ясень", "Волос единорога", 30);
        System.out.println("Палочка 2: " + wand2.woodType + ", ядро: " + wand2.core + ", длина: " + wand2.length + " см");
    }
}

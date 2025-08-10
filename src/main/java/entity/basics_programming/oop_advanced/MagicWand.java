package entity.basics_programming.oop_advanced;

public class MagicWand {
    private String owner; // имя владельца палочки
    private static int totalWandsSold = 0; // общее количество проданных палочек

    public MagicWand(String owner) {
        this.owner = owner;
        totalWandsSold++;
    }

    void showOwner() {
        System.out.println("Имя владельца палочки: " + owner);
    }
    static void showTotalWandsSold() {
        System.out.println("Всего палочек продано: " + totalWandsSold);
    }
}

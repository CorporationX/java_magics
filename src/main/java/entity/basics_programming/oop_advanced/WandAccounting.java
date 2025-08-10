package entity.basics_programming.oop_advanced;

import entity.basics_programming.oop_base.Wand;

public class WandAccounting {
    public static void main(String[] args) {
        MagicWand wand1 = new MagicWand("Гарри");
        MagicWand wand2 = new MagicWand("Гермиона");
        MagicWand wand3 = new MagicWand("Рон");

        wand1.showOwner(); // Показываем владельца первой палочки
        wand2.showOwner(); // Показываем владельца второй палочки
        wand3.showOwner(); // Показываем владельца третьей палочки
        MagicWand.showTotalWandsSold(); // Показываем общее количество проданныйх палочек
    }
}

package entity.hogwarts.magic;

public class GringottsBalance {
    public static void main(String[] args) {
        String wizardName = "Гарри Поттер"; //Имя владельца счета
        int gold = 120; //Начальная сумма золота
        double bonusMultiplier = 1.15; //Процент магического бонуса
        float maxStorage = 1000.5f; //Максимальная сумма хранения в ячейке
        char currencySymbol = '$'; //Тип валюты
        byte vipCode = 42; //VIP-код клиента (от -128 до 127)
        short vipBonus = 50; //VIP-бонус
        long accountYears = 200; //Количество лет хранения счета

        double bonusGold = (gold * bonusMultiplier) - gold;
        double totalBalance = gold + bonusGold + vipBonus;

        System.out.println("Имя владельца счета: " + wizardName);
        System.out.println(currencySymbol + " Текущий баланс: " + totalBalance + " золотых");
        System.out.println("VIP-код: " + vipCode + " дополнительный бонус " + vipBonus);
        System.out.println("Максимальное хранилище " + maxStorage);
        System.out.println("Счету уже " + accountYears + " лет!");
    }
}

public class GringottsBalance {
    public static void main(String[] args) {
        // Изначальные данные
        String wizardName = "Гарри Поттер";
        int gold = 120;
        double bonusMultiplier = 1.15;
        float maxStorage = 1000.5f;
        char currencySymbol = '$';
        byte vipCode = 42;
        short vipBonus = 50;
        long accountYears = 200;

        //Бонус
        double bonusGold = (gold * bonusMultiplier) - gold;
        double totalBalance = gold + bonusGold + vipBonus;

        // Вывод
        System.out.println("Волшебник: " + wizardName);
        System.out.println("$ Текущий баланс: " + totalBalance);
        System.out.println("VIP-код: " + vipCode + ", дополнительный бонус: " + vipBonus);
        System.out.println("Максимальное хранилище: " + maxStorage);
        System.out.println("Счёту уже " + accountYears + " лет!");



    }
}

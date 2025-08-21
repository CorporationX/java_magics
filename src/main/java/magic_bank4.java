public class magic_bank4 {
    public static void main(String[] args) {
        String wizardName = "Гарри Поттер";
        int gold = 100;
        double bonusMultiplier = 1.15;
        float maxStorage = 1000.5f;
        char currencySymbol = '$';
        byte vipCode = 42;
        short vipBonus = 50;
        long accountYears = 200;

        double bonusGold = (gold * bonusMultiplier) - gold;
        double totalBalance = gold + bonusGold + vipBonus;

        System.out.println("Волшебник: " + wizardName);
        System.out.println(currencySymbol + " Текущий баланс: " + totalBalance + " золотых" );
        System.out.println("VIP-code: " + vipCode + ", VIP-bonus: " + vipBonus);
        System.out.println("Максимальный размер хранилищя: " + maxStorage);
        System.out.println("Счету уже " + accountYears + "лет!");
    }
}

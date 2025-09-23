public class MagicWand {
    private String owner; // Поле с владельцем палочки (у каждого студента свое)
    static int totalWandsSold = 0; // Статистическое поле (общее)

    // Конструктор, который назначает владельца палочки
    public MagicWand(String owner) {
        this.owner = owner;
        totalWandsSold++; // Добавляем +1 при покупке палочки
    }
    //Обычный метод: показывает владельца палочки
    public void showOwner() {
        System.out.println("Владелец палочки: " + owner);
    }

    // Статический метод: показывает, сколько всего продано палочек
    static void showTotalWandsSold() {
           System.out.println("Всего продано палочек: " + totalWandsSold);
}
}

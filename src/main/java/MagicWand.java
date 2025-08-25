class MagicWand {
    private String owner; // Обычное поле (у каждого студента своё)
    private static int totalWandsSold = 0; // Статическое поле (общее для всех)

    // Конструктор, который назначает владельца палочки
    public MagicWand(String owner) {
        this.owner = owner;
        totalWandsSold++; // При создании палочки увеличиваем общее количество
    }

    // Обычный метод: показывает владельца палочки
    public void showOwner() {
        System.out.println("Владелец палочки: " + owner);
    }

    // Статический метод: показывает, сколько всего продано палочек
    public static void showTotalWandsSold() {
        System.out.println("Всего продано палочек: " + totalWandsSold);
    }
}
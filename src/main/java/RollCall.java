public class RollCall {
    public static void main(String[] args) {
        // Создаем массив с именами команды
        String[] team = {"Гарри", "Рон", "Гермиона", "Драко", "Фред", "Джордж", "Кэти" };

        // Выводим всех игроков на экран
        System.out.println("Состав команды перед игрой:");
        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i + 1) + ": " + team[i]);
        }

        // Меняем игрока №5
        team[5 - 1] = "Ли Джордан";
        System.out.println("\nФред травмирован! Заменяем его на Ли Джордана.\n");

        // Выводим измененный состав
        System.out.println("Новый состав команды:");
        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i + 1) + ": " + team[i]);
        }
    }
}

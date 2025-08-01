public class RollCall {
    public static void main(String[] args) {
        String[] team = {"Гарри", "Рон", "Гермиона", "Драко", "Фред", "Джордж", "Кэти"};

        System.out.println("Состав команды перед игрой:");
        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i+1) + ": " + team[i]);
        }

        System.out.println("Фред травмирован! Заменяем его на Ли Джордана.");
        team[4] = "Ли Джордан";

        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i+1) + ": " + team[i]);
        }

    }
}


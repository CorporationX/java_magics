public class RollCall {
    public static void main(String[] args) {

        //Стартовый состав команды
        String[] team = {"Гарри", "Рон", "Гермиона", "Драко", "Фред", "Джордж", "Кэти"};

        //Вывод стартового состава комнады
        System.out.println("Состав команды перед игрой: ");
        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i + 1) + ": " + team[i]);
        }
        //Фред травмирован, заменяем его на другого игрока
        System.out.println("Фред травмирован! Заменяем его на Ли Джордана.");

        //Новый состав команды
        String[] teamnow = {"Гарри", "Рон", "Гермиона", "Драко", "Ли Джордан", "Джордж", "Кэти"};
        //Выводим  новый состав комнады
        System.out.println("Состав новой команды: ");
        for (int i = 0; i < teamnow.length; i++) {
            System.out.println("Игрок №" + (i + 1) + ": " + teamnow[i]);
        }

    }
}

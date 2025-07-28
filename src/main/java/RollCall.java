public class RollCall {
    public static void main(String[] args){
        String[] team = {"Гарри", "Рон", "Гермиона", "Драко", "Фред"};
        System.out.println("Состав команды перед игрой: ");
        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i + 1) + ": " + team[i]);
        }
        team[3] = "Ли Джордан";
        System.out.println("\nЗамена Драко на Ли Джордана. Травма!");
        System.out.println("\nНовый состав команды: ");
        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i + 1) + ": " + team[i]);
        }
    }
}

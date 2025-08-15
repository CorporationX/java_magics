package task31;

public class MagicCreatureAccounting {
    public static void main(String[] args) {
        MagicCreature creature1 = new MagicCreature("Василиск", 400);
        MagicCreature creature2 = new MagicCreature("Мозгошмыг", 100);
        MagicCreature creature3 = new MagicCreature("Гриндилоу", 500);
        MagicCreature creature4 = new MagicCreature("Пикси", -50);
        MagicCreature creature5 = new MagicCreature("Гиппогриф", 50);

        MagicCreature.printStatistics();

    }
}

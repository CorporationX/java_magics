public class MagicCreatureAccounting {
    public static void main(String[] args) {
        MagicCreature2 creature1 = new MagicCreature2("Пушистик", 100);
        MagicCreature2 creature2 = new MagicCreature2("Клювокрыл", 140);

        MagicCreature2.printStatistics();
        creature1.printInfoCreature();

        // Алтернативный вывод
        System.out.println("\nСоздано существ: " + MagicCreature2.getCount());
        System.out.println("Максимальная сила: " + MagicCreature2.getMaxPower());
    }
}

public class MagicCreatureMain {
    public static void main(String[] args) {
        MagicCreature creature = new MagicCreature("Пушистик", 50, 50);
        System.out.println("Начальное состояние:");
        creature.printStatus();
        System.out.println();

        System.out.println("Вы покормили " + creature.getName() + ".");
        creature.feed(30);  // +15 к здоровью, +10 к настроению

        System.out.println("Вы поиграли с " + creature.getName() + ".");
        creature.play();    // +10 к настроению, -5 к здоровью

        System.out.println("Вы снова покормили " + creature.getName() + ".");
        creature.feed(10);  // +5 к здоровью, +3 к настроению

        System.out.println("\nТекущее состояние:");
        creature.printStatus();
    }
}

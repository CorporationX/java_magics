public class MagicCreatureMain {
    public static void main(String[] args) {
    MagicCreature creature = new MagicCreature("Пушистик", 80, 90);

    creature.printStatus();
    System.out.println();

    creature.feed(10);
    System.out.println("Вы покормили " + creature.getName() + ".");
    creature.play();
    System.out.println("Вы поиграли с " + creature.getName() + ".");
    System.out.println();
    creature.printStatus();
    }
}

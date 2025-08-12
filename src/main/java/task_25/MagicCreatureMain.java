package task_25;

public class MagicCreatureMain {
    public static void main(String[] args) {
        MagicCreature creature = new MagicCreature("Пушистик", 10, 50);
        creature.printStatus();

        creature.play();
        creature.printStatus();

        creature.play();
        creature.printStatus();

        creature.play();
        creature.printStatus();

        creature.feed(30);
        creature.printStatus();

        creature.feed(300);
        creature.printStatus();

    }
}

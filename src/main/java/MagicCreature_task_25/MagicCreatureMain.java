package MagicCreature_task_25;

public class MagicCreatureMain {
    public static void main(String[] args) {
        MagicCreature creature = new MagicCreature("Tangetsu", 50, 50);

        creature.play();
        creature.play();

        creature.feed(100);

        creature.printStatus();
    }    
}
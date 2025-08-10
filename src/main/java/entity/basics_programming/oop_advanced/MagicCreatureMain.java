package entity.basics_programming.oop_advanced;

import static entity.basics_programming.oop_advanced.MagicCreature.printStatistics;

public class MagicCreatureMain {
    public static void main(String[] args) {
        MagicCreature pushistik = new MagicCreature("Пушистик", 50);
        MagicCreature gippogrif = new MagicCreature("Гиппогриф", 90);
        MagicCreature hvostoroga = new MagicCreature("Хвосторога", 120);

        printStatistics();
    }
}

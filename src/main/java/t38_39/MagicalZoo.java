package t38_39;

public class MagicalZoo {
    public static void main(String[] args) {
        MagicalCreature[] magicalCreatures = {
            new Hippogriff(),
            new Troll(),
            new Patronus(),
        }; ;

        Muggle muggle = new Muggle("Маггл");

        for (MagicalCreature creature : magicalCreatures) {
            creature.interact();
        }

        for (MagicalCreature creature : magicalCreatures) {
            creature.interact(muggle);
        }
    }
}

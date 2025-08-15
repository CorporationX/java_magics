public class MagicalZoo {
    public static void main(String[] args) {
        MagicalCreature[] creatures = {
                new Hippogriff(),
                new Troll(),
                new Patronus()
        };

        for (MagicalCreature creature : creatures) {
            creature.interact();
        }

        System.out.println();
        Muggle muggle = new Muggle();
        for (MagicalCreature creature : creatures) {
            creature.interact(muggle);
        }
    }
}

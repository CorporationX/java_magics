public class MagicalZoo {
    public static void main(String[] args) {
        MagicalCreature[] creatures = {new Hippogriff(), new Troll(), new Patronus()};
        for (MagicalCreature creature : creatures) {
            creature.interact();
        }

        System.out.println("\nКак существа реагируют на маглов:");
        Muggle muggle = new Muggle();
        for (MagicalCreature creature : creatures) {
            creature.interact(muggle);
        }
    }
}
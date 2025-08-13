package entity.basics_programming.oop_advanced;

public class MagicalZoo {
    public static void main(String[] args) {
        MagicalCreature[] magicalCreatures = {
                new Hippogriff(),
                new Troll(),
                new Patronus()
        };
        for (MagicalCreature magicalCreature : magicalCreatures) {
            magicalCreature.interact();
        }

        System.out.println("\nКак существа реагируют на маглов:\n");
        Muggle muggle = new Muggle();

        for (MagicalCreature magicalCreature : magicalCreatures) {
            magicalCreature.interact(muggle);
        }
    }
}

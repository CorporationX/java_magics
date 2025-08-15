public class Hippogriff extends MagicalCreature {
    @Override
    public void interact() {
        System.out.println("Гиппогрифф грациозно кланяется.");
    }

    @Override
    public void interact(Muggle muggle) {
        System.out.println("Гиппогриф смотрит с подозрением.");
    }
}

package t38_39;

public class Hippogriff extends MagicalCreature {
    @Override
    public void interact() {
        System.out.println("Гиппогриф кланяется в знак уважения.");
    };

    @Override
    public void interact(Muggle muggle) {
        System.out.println("Гиппогриф смотрит с подозрением.");
    }
}

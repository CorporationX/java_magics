package t38_39;

public class Patronus extends MagicalCreature {
    @Override
    public void interact() {
        System.out.println("Патронус освещает пространство и изгоняет дементоров!");
    };
    @Override
    public void interact(Muggle muggle) {
        System.out.println("Патронус не реагирует, ведь маглы его не видят.");
    }
}

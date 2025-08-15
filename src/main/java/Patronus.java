public class Patronus extends MagicalCreature {

    @Override
    public void interact() {
        System.out.println("Патронус испускает свет, пугая дементоров!");
    }

    @Override
    public void interact(Muggle muggle) {
        System.out.println("Маглы не видят патронус.");
    }
}

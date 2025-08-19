package task37;

public class Hippogriff extends MagicTransport implements Flyable {
    public Hippogriff() {
        super("Когтекрыл", 70);
    }

    @Override
    public void fly() {
        System.out.println("Гиппогриф машет крыльями!");
    }

    @Override
    public void move() {
        fly();
        System.out.println("Гиппогриф взлетает со скоростью " + getSpeed());
    }


}

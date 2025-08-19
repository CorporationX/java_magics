package task37;

public class Broomstick extends MagicTransport implements Flyable {
    public Broomstick() {
        super("Нимбус 2000", 50);
    }

    @Override
    public void fly() {
        System.out.println("Метла взлетает!");
    }

    @Override
    public void move() {
        fly();
        System.out.println("Метла летит со скоростью: " + getSpeed());
    }

}

package entity.basics_programming.oop_advanced.task37;

public class Broomstick extends MagicTransport implements Flyable {

    public Broomstick() {
        super("Нимбус 2000", 50);
    }

    @Override
    void move() {
        fly();
        System.out.println("Метла летит со скоростью " + getSpeed());
    }

    @Override
    public void fly() {
        System.out.println("Метла взлетает!");
    }
}

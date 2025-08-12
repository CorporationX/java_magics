package entity.basics_programming.oop_advanced;

public class Broomstick extends MagicTransport implements Flyable {

    public Broomstick() {
        super("Нимбус 2000", 50);
    }

    @Override
    void move() {
        fly();
        System.out.println("Метла летит со скоростью " + speed);
    }

    @Override
    public void fly() {
        System.out.println("Метла взлетает!");
    }
}

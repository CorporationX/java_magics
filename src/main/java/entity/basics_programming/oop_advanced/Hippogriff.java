package entity.basics_programming.oop_advanced;

public class Hippogriff extends MagicTransport implements Flyable {

    public Hippogriff() {
        super("Когтекрыл", 70);
    }

    @Override
    void move() {
        fly();
        System.out.println("Гиппогриф взлетает со скоростью " + speed);
    }

    @Override
    public void fly() {
        System.out.println("Гиппогриф машет крыльями!");
    }
}

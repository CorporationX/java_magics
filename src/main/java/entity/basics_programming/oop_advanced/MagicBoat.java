package entity.basics_programming.oop_advanced;

public class MagicBoat extends MagicTransport{

    public MagicBoat() {
        super("Лодка Хагрида", 20);
    }

    @Override
    void move() {
        System.out.println("Лодка плывёт со скоростью " + speed);
    }
}

public class MagicBoat extends MagicTransport {
    public MagicBoat() {
        super("Лодка Хагрида", 20);
    }

    @Override
    void move() {
        System.out.println("Лодка плывет со скоростью " + getSpeed() + " км/ч");
    }
}

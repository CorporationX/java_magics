package task37;

public class MagicBoat extends MagicTransport {
    public MagicBoat() {
        super("Лодка Хагрида", 20);
    }

    @Override
    public void move() {
        System.out.println("Лодка плывет со скоростью " + getSpeed()) ;
    }

}

package task37;

public class MagicTransportMain {
    public static void main(String[] args) {
        MagicTransport[] magicTransports = {
            new Broomstick(),
            new Hippogriff(),
            new MagicBoat(),
        };

        for (MagicTransport transport : magicTransports) {
            transport.move();
            transport.printInfo();
        }
    }
}

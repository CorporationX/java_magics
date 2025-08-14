public class MagicTransportMain {
    public static void main(String[] args) {
        MagicTransport[] transports = {
                new Broomstick(),
                new Hippogriff(),
                new MagicBoat()
        };

        for (MagicTransport transport : transports) {
            transport.move();
            transport.printInfo();
            System.out.println();
        }
    }
}

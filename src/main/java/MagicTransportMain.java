public class MagicTransportMain {
    public static void main(String[] args) {
        MagicTransport[] transports = {
                new Broomstick("Нимбус 2000", 50),
                new Hippogriff("Когтекрыл", 70),
                new MagicBoat("Лодка Хагрида", 20)
        };

        for (MagicTransport t : transports) {
            t.move();
            t.printInfo();
            System.out.println();
        }
    }
}

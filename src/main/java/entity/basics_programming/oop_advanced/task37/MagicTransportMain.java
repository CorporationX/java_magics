package entity.basics_programming.oop_advanced.task37;

public class MagicTransportMain {
    public static void main(String[] args) {
        // создаём магический транспорт
        MagicTransport[] magicTransports = {
                new Broomstick(),
                new Hippogriff(),
                new MagicBoat()
        };

        // выводим данные на экран
        for (MagicTransport magicTransport : magicTransports) {
            magicTransport.move();
            magicTransport.printInfo();
            System.out.println();

        }
    }
}

package t22_24;

public class MagicHourglassMain {
    public static void main(String[] args) {
        MagicHourglass hourglass = new MagicHourglass();
        System.out.println("Часы созданы, оставшееся время: " + hourglass.getTime());

        hourglass.tick();
        System.out.println("Оставшееся время: " + hourglass.getTime());
        hourglass.tick();
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.stop();
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.tick();
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.start();
        hourglass.tick();
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.flip(25);
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.flip(5);
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.flip(1055);
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.stop();
        hourglass.flip(50);
        System.out.println("Оставшееся время: " + hourglass.getTime());

        hourglass.stop();
        hourglass.tick();
        System.out.println("Оставшееся время: " + hourglass.getTime());



    }


}

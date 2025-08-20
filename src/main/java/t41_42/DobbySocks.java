package t41_42;

public class DobbySocks {
    public static void main(String[] args) {
        String[] socks = {
                "Красный носок",
                null,
                "Синий носок",
                "Зелёный носок",
                null
        };

        for (String sock : socks) {
            try {
                System.out.println("Добби надевает " + sock.toUpperCase());
                System.out.println("Добби надел носок!");
            } catch (NullPointerException e) {
                System.out.println("Добби потерял носок!");
            } finally {
                System.out.println("Добби продолжает искать носки...\n");
            }


        }
    }
}

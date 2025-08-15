package entity.basics_programming.exceptions;

public class DobbySocks {
    public static void main(String[] args) {
        String[] socks = {"Красный носок", null, "Синий носок", "Зеленый носок", null};

        for (int i = 0; i < socks.length; i++) {
            try {
                System.out.println("Добби надевает " + socks[i].toUpperCase());
                System.out.println("✅ Добби надел носок!");
            } catch (NullPointerException e) {
                System.out.println("⚠\uFE0F Добби потерял носок!");
            } finally {
                System.out.println("Добби продолжает искать носки..\n");
            }
        }
    }
}

package Exceptions;

public class DobbySocks {
    public static void main(String[] args) {
        String[] socks = {"Красный носок", null, "Синий носок", "Зелёный носок", null};

        for (int i = 0; i < socks.length; i++) {
            System.out.println("Добби надевает: " + socks[i].toUpperCase());
            try {
                System.out.println("Добби надевает: " + socks[i].toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Добби потерял носок!");
            } finally {
                System.out.println("Добби продолжает искать носки..");
            }
        }
    }
}

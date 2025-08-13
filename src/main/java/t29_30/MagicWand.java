package t29_30;

public class MagicWand {
    private String owner;
    private static int totalWandSold = 0;

    public MagicWand(String owner) {
        this.owner = owner;
        totalWandSold++;
    }

    public void showOwner() {
        System.out.println("Владелец палочки: " + this.owner);
    }

    public static void showTotalWandSold() {
        System.out.println("Всего палочек продано: " + totalWandSold);
    }


}

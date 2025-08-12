public class MagicWand {
    private final String owner;
    public static int totalWandSold = 0;

    public MagicWand(String owner) {
        this.owner = owner;
        totalWandSold++;
    }


    public void showOwner() {
        System.out.println(owner);
    }

    public static void showTotalWandsSold() {
        System.out.println(totalWandSold);
    }

}

import java.util.Random;

public class GoldenSnitch {
    public static void main(String[] args) {
        int control = 50;
        Random random = new Random();

        int r;
        while (true) {
            r = random.nextInt(0,101);
            if (r != control) {
                System.out.print("!");
            } else {
                System.out.println("\n" + "Снитч пойман! Игра закончена.");
                break;
            }
        }
    }
}

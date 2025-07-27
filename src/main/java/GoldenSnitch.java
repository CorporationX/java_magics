
import java.util.Random;

public class GoldenSnitch {
    public static void main(String[] args) {
        int zagad = 50;
        Random random = new Random();
        while (true){
            int control = random.nextInt(0,100);
            if (control == zagad){
                System.out.println("Снитч пойман! Игра закончена.");
                break;
            } else {
                System.out.println("!");
            }
        }
    }
}

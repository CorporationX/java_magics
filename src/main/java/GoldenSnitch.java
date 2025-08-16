import java.util.Random;

public class GoldenSnitch {
    public static void main(String[] args) {
         Random random = new Random();

         while (true) {
             int control = random.nextInt(101);
             int win = (control == 55) ? 1 : 2;
             if (win == 1) {
                 System.out.println("Победа, игра окончена!");
                 break;
             } else {
                 System.out.println("!");
             }
         }
    }
}

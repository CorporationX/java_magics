import java.util.Random;

public class GoldenSnitch {
    public static void main(String[] args){
        int num = 50;
        Random random = new Random();
        while (true){
            int control = random.nextInt(101);
            if (control == num){
                System.out.println("\nСнитч пойман! Игра закончена.");
                break;
            }
            else{
                System.out.print("!");
            }
        }
    }
}

import java.util.Random;

public class GoldenSnitch {
    public static void main(String[] args) {
        int theIntendedNumber = 50; // Задуманное чило

        while(true){
            int control = new Random().nextInt(101);
            if(control == theIntendedNumber) {
                System.out.println();
                System.out.println("Снитч пойман! Игра закончена");
                break;
            }
            System.out.print("!");
        }
    }
}

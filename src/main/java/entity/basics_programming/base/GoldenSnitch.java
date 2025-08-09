package entity.basics_programming.base;

import java.util.Random;

public class GoldenSnitch {
    public static void main(String[] args) {
        int IntendedNumber = 50;

        while(true){
            int control = new Random().nextInt(101);
            if(control == IntendedNumber) {
                System.out.println("\nСнитч пойман! Игра закончена");
                break;
            }
            System.out.print("!");
        }
    }
}

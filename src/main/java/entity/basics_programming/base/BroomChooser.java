package entity.basics_programming.base;

public class BroomChooser {
    public static void main(String[] args) {
        int speed = 120; //скорость метлы

        if (speed > 150)
            System.out.println("эта метла из категории \"метла для профессионального квиддича\"");
        else if (speed < 100)
            System.out.println("эта метла из категории \"только для обучения\"");
        else
            System.out.println("эта метла из категории \"отличная метла для ученика\"");
    }
}

public class BroomChooser {
    public static void main(String[] args){
        int speed = 120;
        if(speed>150)
            System.out.println("Метла для профессионального квиддича");
        else if(speed>=100 && speed<=150)
            System.out.println("Отличная метла для ученика");
        else
            System.out.println("Только для обучения");
    }
}

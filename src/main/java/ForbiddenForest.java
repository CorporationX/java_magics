import java.util.Random;

public class ForbiddenForest {
    public static void main(String[] args) {
        Random random = new Random();
        int mpower = random.nextInt(1,100);
        boolean hinpotion = random.nextBoolean();
        boolean hhartifact = random.nextBoolean();
        boolean hwand = random.nextBoolean();

        if (hwand && mpower > 80) {
            System.out.println("Прошел");
        } else if (mpower > 50 && hinpotion){
            System.out.println("тоже прошли");
        } else if (mpower < 50 && hhartifact) {
            System.out.println("Хагрит протащил");
        } else { 
            System.out.println("ТЫ НЕ ПРОЙДЕШЬ!!");
        }
        if (mpower > 95){
            System.out.println("Протащи друга");
        }
    }
}

public class Quidditch {
    public static void main(String[] args) {
        for (int i =1; i <= 3; i++) {

            String ball;

            if (i == 1) {
                ball = "Quaffle";
            } else if (i == 2) {
                ball = "Bludger";
            } else {
                ball = "Golden Snitch";
            }
            System.out.println("Запущен мяч под названием: " + ball);
        }
    }
}

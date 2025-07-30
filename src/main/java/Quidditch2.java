public class Quidditch2 {
    public static void main(String[] args) {
        String ball;

        // WHILE
        // if
        System.out.println("\n" + "WHILE | IF" + "\n");
        int i = 1;
        while (i <= 3) {
            if (i == 1) {
                ball = "Quaffle";
            } else if (i == 2) {
                ball = "Bludger";
            } else {
                ball = "Golden Snitch";
            }
            System.out.println("Запущен мяч под названием: " + ball);
            i++;
        }

        System.out.println("\n" + "WHILE | swithc" + "\n");
        // Switch
        i = 1;
        while (i <= 3) {
            switch (i) {
                case 1:
                    ball = "Quaffle";
                    break;
                case 2:
                    ball = "Bludger";
                    break;
                default:
                    ball = "Golden Snitch";
            }

            System.out.println("Запущен мяч под названием: " + ball);
            i++;
        }

        // Enhanced swithc
        System.out.println("\n" + "WHILE | Enhanced swithc" + "\n");
        i = 1;
        while (i <= 3) {
            ball = switch (i) {
                case 1 -> "Quaffle";
                case 2 -> "Bludger";
                default -> "Golden Snitch";
            };

            System.out.println("Запущен мяч под названием: " + ball);
            i++;
        }

        // do while
        System.out.println("\n" + "DO WHILE" + "\n");
        i = 1;
        do {
            ball = switch (i) {
                case 1 -> "Quaffle";
                case 2 -> "Bludger";
                default -> "Golden Snitch";
            };
            i++;
            System.out.println("Запущен мяч под названием: " + ball);
        } while (i <= 3);
    }
}

public class MagicHourglass {
    private int secondsLeft = 60;
    private boolean isRunning = true;

    public void flip(int seconds) {
        if (seconds < 10 || seconds > 60) {
            secondsLeft = 60;
        } else {
            secondsLeft = seconds;
        }
        isRunning = true;
        System.out.println("Вы перевернули часы, времени теперь: " + secondsLeft + " секунд.");
    }

    public void tick() {
        if (!isRunning) {
            System.out.println("Часы не идут, переверните их");
        }
        if (secondsLeft > 0) {
            secondsLeft --;
            System.out.println("Время идёт, осталось " + secondsLeft + " секунд.");
        } else if (secondsLeft == 0) {
            isRunning = false;
            System.out.println("Время вышло");
        }
    }

    public int getSecondsLeft() {
        return secondsLeft;
    }

    public void stop() {
        isRunning = false;
        System.out.println("Часы остановлены.");
    }

    public void start() {
        if (secondsLeft > 0) {
            isRunning = true;
            System.out.println("Часы идут.");
        } else {
            System.out.println("Нельзя запустить часы без переворота, переверните их.");
        }
    }
}

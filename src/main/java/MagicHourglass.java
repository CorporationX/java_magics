public class MagicHourglass {
    private int secondsLeft = 60;
    private boolean isRunning = true;

    public void tick() {
        if (!isRunning) {
            System.out.println("Часы стоят.");
            return;
        }
        if (secondsLeft > 0) {
            secondsLeft --;
            System.out.printf("Время идёт осталось: " + secondsLeft + " секунд.");
        }
        if (secondsLeft == 0) {
            isRunning = false;
            System.out.println("Время закончилось!");
        }
    }
    public void flip(int seconds) {
        if (seconds < 10 || seconds > 60) {
            secondsLeft = 60;
        } else {
            secondsLeft = seconds;
        }
            System.out.println("Вы перевернули часы, осталось времени: " + seconds + " секунд!");
    }

    public int getTime() {
        return secondsLeft;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void stop() {
        isRunning = false;
        System.out.println("Часы остановились.");
    }

    public void start() {
        if (secondsLeft > 0) {
            isRunning = true;
            System.out.println("часы снова идут!");
        } else {
            System.out.println("Нужно перевернуть часы!");
        }
    }
}
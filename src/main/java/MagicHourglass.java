public class MagicHourglass {
    private int secondsLeft = 60;
    private boolean isRunning = true;
    
    public int getSecondsLeft() {
        return secondsLeft;
    }
    public boolean isRunning() {
        return isRunning;
    }

    public void tick(){
        if (!isRunning) {
            System.out.println("Часы стоят, нужно перевернуть часы");
            return;
        } else if (secondsLeft > 0){
            secondsLeft--;
            System.out.println("Осталось времени " + secondsLeft + "секунд");
        } else if (secondsLeft == 0){
            isRunning = false;
            System.out.println("Время вышло, нужно перевернуть ");
        }
    }
    public void flip(int seconds){
        if (seconds < 10 || seconds > 60) {
            secondsLeft = 60;
        } else {
            secondsLeft = seconds;
        }
    }
    public void stop(){
        isRunning = false;
        System.out.println("Часы остановлены");
    }
    public void start(){
        if (secondsLeft > 0) {
            isRunning = true;
            System.out.println("Часы запущены");
        } else {
            System.out.println("Нельзя запустить, нужно перевернуть часы");
        }
    }
    public static void main(String[] args) {
        MagicHourglass hourglass = new MagicHourglass();
        System.out.println("Осталось времени " + hourglass.getSecondsLeft() + "секунд");

        hourglass.tick();
        hourglass.tick();
        System.out.println("Осталось времени " + hourglass.getSecondsLeft() + "секунд");

        hourglass.flip(45);
        System.out.println("Осталось времени " + hourglass.getSecondsLeft() + "секунд");

        hourglass.stop();

        hourglass.tick();

        hourglass.start();

        hourglass.flip(5);
        System.out.println("Осталось времени " + hourglass.getSecondsLeft() + "секунд");

        hourglass.start();
    }
}

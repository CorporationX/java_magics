package t22_24;

public class MagicHourglass {
    private int seconds = 60;
    private boolean isTurned = true;

    public int getTime() {
        return seconds;
    }

    public void tick() {
        if (isTurned) {
            seconds--;
            System.out.println("Время идет. Осталось " + seconds + "секунд");
            if (seconds < 1) {
                System.out.println("Время истекло. Часы остановлены");
                isTurned = false;
            }
        } else {
            System.out.println("Часы остановлены. Запустите их.");
        }

    }

    public void start() {
        isTurned = true;
    }

    public void stop() {
        isTurned = false;
    }

    public void flip(int seconds) {
        if (seconds < 10 || seconds >60) {
            this.seconds = 60;
            System.out.println("Введено недопустимое значение. Установлено значение: 60");
        } else {
            this.seconds = seconds;
            System.out.println("Вы перевернули часы. Установлено время: " + this.seconds + "секунд.");
        }
        isTurned = true;
    }
}

public class MagicHourglass {
    private int secondsLeft = 60; // Начальное время.
    private boolean isRunning = true; // Часы идут.

    //Добавляем геттер,чтобы нельзя было менять время напрямую.
    public int getTime () {
        return secondsLeft;
    }

    // Добавляем метод flip
    public void flip() {
        if (seconds < 10 || seconds > 60) {
            secondsLeft = 60; // Если значение неверное, то время становится 60 секунд
        } else {
            secondsLeft = seconds;
        }
        isRunning = true;
        System.out.println("Вы перевернули песочные часы! Теперь время: " + secondsLeft + "секунд!");
    }

    // Добавляем метод tick
    public void tick() {
        if (!isRunning) {
            System.out.println("Часы не идут! Переверни их!");
            return;
        }
        if (secondsLeft > 0) {
            secondsLeft--;
            System.out.println("Время идет... Осталось " + secondsLeft + "секунд.");
        }
        if (secondsLeft == 0) {
            isRunning = false;
            System.out.println("Время остановилось! Переверни часы!");
        }
    }

    // Добавляем метод остановки и запуска часов.
    public void stop() {
        if (!isRunning) {
            System.out.println("Время остановилось!");
        }
    }
    public void start() {
        if (secondsLeft > 0) {
            isRunning = true;
            System.out.println("Время возобновилось!");
        } else {
            System.out.println("Время нельзя возобновить! Переверни часы!");
        }

    }
}

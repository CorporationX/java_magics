public class MagicHourglass {
    private int secondsLeft = 60; // оставшееся время в сек
    private boolean isRunning = true; // Часы идут

    // Геттер: получить оставшееся время
    public int getTime() {
        return secondsLeft;
    }

    // Метод для уменьшения времени на 1 секунду
    public void tick() {
        if (!isRunning) {
            System.out.println("⏳ Часы не идут! Переверните их.");
            return;
        }
        if (secondsLeft > 0) {
            System.out.println("⏳ Время идёт... Осталось " + secondsLeft + " сек.\"");
            secondsLeft--;
        }
        if (secondsLeft == 0) {
            isRunning = false;
            System.out.println("❌ Время истекло! Переверните часы, чтобы запустить снова.");
        }
    }

    // Метод для переворота песочных часов (с разным временем)
    public void flip(int second) {
        if (second >= 10 && second <= 60) {
            secondsLeft = second;
        } else {
            secondsLeft = 60;
        }
        isRunning = true;
        System.out.println("\uD83D\uDD04 Вы перевернули песочные часы! Времени теперь: " + secondsLeft + " секунд");
    }

    // Метод для остановки часов вручную
    public void stop() {
        isRunning = false;
        secondsLeft = 0;
        System.out.println("⏳ Часы остановлены.");
    }

    // Метод для запуска часов вручную
    public void start() {
        if (secondsLeft > 0) {
            isRunning = true;
            System.out.println("▶ Часы снова идут!");
        } else
            System.out.println("❌ Нельзя запустить часы без переворота! Переверните их.");
    }
}

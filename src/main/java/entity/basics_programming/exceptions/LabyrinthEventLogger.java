package entity.basics_programming.exceptions;
import java.util.logging.*; // Нужен этот импорт

class LabyrinthEventLogger {
    // Получаем логгер для этого класса
    private static final Logger logger = Logger.getLogger(LabyrinthEventLogger.class.getName());

    public static void main(String[] args) {
        logger.info("Гарри вошел в лабиринт."); // Сообщение: Обычное событие

        logger.warning("Обнаружен туман, видимость снижена."); // Сообщение: Предупреждение

        // Уровни ниже INFO (fine, finer, finest) по умолчанию могут не выводиться
        logger.fine("Гарри проверяет компас.");

        logger.severe("Встреча с Дементором!"); // Сообщение: Серьезная проблема/событие

        logger.info("Гарри успешно применил Патронуса.");
    }
}
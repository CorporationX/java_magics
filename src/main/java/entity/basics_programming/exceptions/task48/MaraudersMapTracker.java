package entity.basics_programming.exceptions.task48;

import java.util.logging.Logger;

public class MaraudersMapTracker {
    private static final Logger logger = Logger.getLogger(MaraudersMapTracker.class.getName());

    public void trackCoordinates(String studentName, Integer x, Integer y) {
        if (x == null || y == null) {
            logger.severe("Ошибка сенсора! Ученик " + studentName + " находится в неизвестной локации!");
        } else if (x < 0 || y < 0 || x > 1000 || y > 1000) {
            logger.warning("Ученик " + studentName + " находится в каком-то подозрительном месте: (" + x + ", " + y + ")");
        } else {
            logger.info("Всё в порядке, ученик " + studentName + " двигается дальше: (" + x + ", " + y + ")");
        }
    }
}

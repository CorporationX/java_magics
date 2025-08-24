package t48;

import java.util.logging.Logger;

public class MaraudersMapTracker {
    private static final Logger logger = Logger.getLogger(MaraudersMapTracker.class.getName());

    public static void trackCoordinates(String studentName, Integer x, Integer y) {
        if (x == null || y == null) {
            logger.severe("Ошибка сенсора! Ученик " + studentName + " находится в неизвестной локации!");
        } else if (x < 0 || y < 0) {
            logger.warning("Ученик " + studentName + " находится в подозрительном месте (" + x + "," + y + ")" );
        } else {
            logger.info("Все в порядке. Ученик " + studentName + " двигается дальше (" + x + "," + y + ")" );
        }
    }

    public static void main(String[] args) {
        trackCoordinates("Гарри", 10, 10);
        trackCoordinates("Гермиона", null, 10);
        trackCoordinates("Драко", -10, 10);
    }

}

package entity.basics_programming.exceptions.task49;

import java.util.logging.Logger;

public class HogwartsWatcher {
    private static final Logger logger = Logger.getLogger(HogwartsWatcher.class.getName());

    public static void scanLocation(String location, String activity) {
        switch (location) {
            case ("Запретный Лес"): // любая активность должна логироваться как SEVERE.
                logger.severe("Критическая угроза! " + activity);
                break;
            case ("Тайная Комната"): // любая активность должна логироваться как WARNING.
                logger.warning("Подозрительная активность! " + activity);
                break;
            case ("Гостиная Гриффиндора"):
                // если activity содержит слово "заклинание" логировать как WARNING. В остальных случаях — как INFO.
                if (activity.contains("заклинание")) {
                    logger.warning("Подозрительная активность. " + activity);
                } else {
                    logger.info("Обычная активность. " + activity);
                }
                break;

            case ("Кабинет Дамблдора"):
                // логировать только SEVERE ошибки, если activity содержит "Волан-де-Морт".
                // В остальных случаях логировать ничего не нужно.
                if (activity.contains("Волан-де-Морт")) {
                    logger.severe("Критическая угроза! " + activity);
                }
                break;
        }
    }
}


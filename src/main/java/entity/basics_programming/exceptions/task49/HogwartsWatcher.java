package entity.basics_programming.exceptions.task49;

import java.util.logging.Logger;

public class HogwartsWatcher {
    private static final Logger logger = Logger.getLogger(HogwartsWatcher.class.getName());

    public static void scanLocation(String location, String activity) {
        switch (location) {
            // любая активность должна логироваться как SEVERE.
            case ("Запретный Лес") -> logger.severe("Критическая угроза! " + activity);
            // любая активность должна логироваться как WARNING.
            case ("Тайная Комната") -> logger.warning("Подозрительная активность! " + activity);
            // если activity содержит слово "заклинание" логировать как WARNING. В остальных случаях — как INFO.
            case ("Гостиная Гриффиндора") -> {
                if (activity.contains("заклинание"))
                    logger.warning("Подозрительная активность. " + activity);
                else
                    logger.info("Обычная активность. " + activity);
            }
            // логировать только SEVERE ошибки, если activity содержит "Волан-де-Морт".
            // В остальных случаях логировать ничего не нужно.
            case ("Кабинет Дамблдора") -> {
                if (activity.contains("Волан-де-Морт")) logger.severe("Критическая угроза! " + activity);
            }
        }
    }
}


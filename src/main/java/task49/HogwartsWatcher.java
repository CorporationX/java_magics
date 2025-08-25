package task49;

import java.util.logging.Logger;

public class HogwartsWatcher {
    private static final Logger logger = Logger.getLogger(HogwartsWatcher.class.getName());

    private static final String FORBIDDENFORREST = "Запретный Лес";
    private static final String CHAMBEROFSECRETS = "Тайная Комната";
    private static final String GRYFFINDORCOMMONROOM = "Гостиная Гриффиндора";
    private static final String DUMBLEDORESOFFICE = "Кабинет Дамблдора";

    public static void scanLocation(String location, String activity) {
        activity = activity + "\n";
        if (location.equals(FORBIDDENFORREST)) {
            logger.severe(FORBIDDENFORREST + " - критическая угроза: " + activity);
        } else if (location.equals(CHAMBEROFSECRETS)) {
            logger.warning(CHAMBEROFSECRETS + " - подозрительная активность: " + activity);
        } else if (location.equals(GRYFFINDORCOMMONROOM)) {
            if (activity.contains("заклинание")) {
                logger.warning(GRYFFINDORCOMMONROOM + " - подозрительная активность: " + activity);
            } else {
                logger.info(GRYFFINDORCOMMONROOM + " - обычная активность: " + activity);
            }
        } else if (location.equals(DUMBLEDORESOFFICE) && activity.contains("Волан-де-Морт")) {
            logger.severe(DUMBLEDORESOFFICE + " - критическая угроза: " + activity);
        } else {
            logger.info(location + " - всё спокойно: " + activity);
        }
    }

    public static void main(String[] args) {
        scanLocation(FORBIDDENFORREST, "Странное свечение в небе");
        scanLocation(CHAMBEROFSECRETS, "Попытка открыть с помощью 'Пароль 123'");
        scanLocation(GRYFFINDORCOMMONROOM, "Студент читает книгу");
        scanLocation(GRYFFINDORCOMMONROOM, "Кто-то произнёс заклинание 'Инсендио'!");
        scanLocation(DUMBLEDORESOFFICE, "Дамблдор пьет чай");
        scanLocation(DUMBLEDORESOFFICE, "Волан-де-Морт появился!");
        scanLocation(FORBIDDENFORREST, "Ля-ля-ля");
        scanLocation(CHAMBEROFSECRETS, "Ло-ло-ло");
        scanLocation(GRYFFINDORCOMMONROOM, "Ла-ла-ла-ла");
    }
}


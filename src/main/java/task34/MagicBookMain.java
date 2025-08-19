package task34;

public class MagicBookMain {
    public static void main(String[] args) {
        MagicBook[] magicBooks = {
                new MagicBook("Рассказы о природе"),
                new WhisperingBook("Шепчущий вестник"),
                new DangerousBook("Опасные приключения"),
        };

        for (MagicBook book : magicBooks) {
            book.open();
        }
//        Вы открыли книгу Рассказы о природе
//        Вы открыли книгу Шепчущий вестник
//        Шшшш! Не трогайте меня! Вы не можете прочитать книгу Опасные приключения

        for (MagicBook book : magicBooks) {
            book.read();
        }
//        Вы читаете книгу Рассказы о природе
//        Вы читаете книгу Шепчущий вестник
//          Книга шепчет: будь осторожен...
//        Сначала нужно открыть книгу

        for (MagicBook book : magicBooks) {
            book.close();
        }
//        Вы закрыли книгу Рассказы о природе
//        Вы закрыли книгу Шепчущий вестник
//        Чтобы закрыть книгу, она должна быть сначала открыта

        DangerousBook dangerousBook2 = new DangerousBook("Очень опасная книга!");
        dangerousBook2.open();
//        Шшшш! Не трогайте меня! Вы не можете прочитать книгу Очень опасная книга!
        dangerousBook2.setHasPermission(true);
        dangerousBook2.open();
//        У вас есть разрешение читать опасную книгу!
//        Вы открыли книгу Очень опасная книга!


        // magicBooks[2].setHasPermission(true) - недоступен.
        // При создании объекта конструктором DangerousBook
        // в массиве типа "MagicBook[]" сеттер setHasPermission(true) недоступен.
        // Вопрос: Получается при таком способе создания до этого аттрибута никак не добраться?
    }
}

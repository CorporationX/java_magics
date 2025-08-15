package task34;

public class MagicBook {
    private String title;
    private boolean isOpen;

    public MagicBook(String name) {
        this.title = name;
        this.isOpen = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean state) {
        isOpen = state;
    }

    public void open() {
        if (!isOpen) {
            System.out.println("Вы открыли книгу " + title);
            isOpen = true;
        } else {
            System.out.printf("Книга %s уже открыта", title);
        }
    }

    public void close() {
        if (isOpen) {
            System.out.println("Вы закрыли книгу " + title);
            isOpen = false;
        } else {
            System.out.println("Чтобы закрыть книгу, она должна быть сначала открыта");
        }
    }

    public void read () {
        if (isOpen) {
            System.out.println("Вы читаете книгу " + title);
        } else {
            System.out.println("Сначала нужно открыть книгу");
        }
    }

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

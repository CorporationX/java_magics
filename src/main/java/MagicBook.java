public class MagicBook {
    private String title;
    private boolean isOpen;

    public MagicBook(String title) {
        this.title = title;
        this.isOpen = false;
    }

    public String getTitle() {
        return title;
    }

    public void open() {
        isOpen = true;
        System.out.println("Вы открыли книгу " + '"' + title + '"');
    }

    public void close() {
        isOpen = false;
        System.out.println("Вы закрыли книгу " + '"' + title + '"');
    }

    public void read() {
        System.out.println("Вы читаете книгу " + '"' + title + '"');
    }

    public static void main(String[] args) {
        MagicBook[] books = new MagicBook[] {
                new MagicBook("История магии"),
                new WhisperingBook("Книга заклинаний"),
                new DangerousBook("Монстр книги о монстрах", false)
        };

        System.out.println("Открываем и читаем книги:");//тут мне подсказала ИИ
        for (MagicBook book : books) {
            book.open();
            book.read();
            System.out.println();
        }

        System.out.println("Закрываем книги:");// и тут
        for (MagicBook book : books) {
            book.close();
        }
    }
}

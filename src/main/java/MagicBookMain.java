public class MagicBookMain {
    public static void main(String[] args) {
        MagicBook[] books = {
                new MagicBook("История магии", false),
                new WhisperingBook("Книга заклинаний", false),
                new DangerousBook("Тёмная магия", false,false)};
        for (MagicBook book : books) {
            book.open();
            book.read();
            book.close();
            System.out.println();
        }
    }
}

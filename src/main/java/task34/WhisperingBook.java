package task34;

public class WhisperingBook extends MagicBook{
    public WhisperingBook(String name) {
        super(name);
    }

    public void read () {
        if (getIsOpen()) {
            System.out.println("Вы читаете книгу " + getTitle());
            System.out.println("  Книга шепчет: будь осторожен...");
        } else {
            System.out.println("Чтобы прочитать книгу, её нужно сначала");
        }
    }
}

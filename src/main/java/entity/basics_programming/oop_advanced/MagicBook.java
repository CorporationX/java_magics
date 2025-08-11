package entity.basics_programming.oop_advanced;

public class MagicBook {
    private String title; // название книги
    private boolean isOpen = false; // открыта ли сейчас книга

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // открыть книгу, выводит на экран "Вы открыли книгу <название книги>"
    public void open() {
        System.out.println("\nВы открыли книгу \"" + this.title + "\"");
        setOpen(true);
        read();
    }

    // закрыть книгу, выводит на экран "Вы закрыли книгу <название книги>"
    public void close() {
        if (isOpen == false) {
            System.out.println("Нельзя закрыть закрытую книгу");
            return;
        }
        System.out.println("Вы закрыли книгу \"" + this.title + "\"");
        setOpen(false);
    }

    public MagicBook(String title) {
        this.title = title;
    }

    // читать книгу, выводит на экран "Вы читаете книгу <название книги>"
    private void read() {
        System.out.println("Вы читаете книгу \"" + this.title + "\"");
    }
}

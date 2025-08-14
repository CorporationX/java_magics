public class MagicBook {
    protected String title;
    private boolean isOpen;

    public String getTitle() {
        return title;
    }

    public boolean isOpen() {
        return isOpen;
    }


    public MagicBook(String title, boolean isOpen) {
        this.title = title;
        this.isOpen = isOpen;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Вы открыли книгу \"" + getTitle() + "\"");
        } else {
            System.out.println("Книга уже открыта!");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Вы закрыли книгу \"" + getTitle() + "\"");
        }
    }

    public void read() {
        if (isOpen) {
            System.out.println("Вы читаете книгу \"" + title + "\"");
        } else {
            System.out.println("Сначала нужно открыть книгу!");
        }
    }
}

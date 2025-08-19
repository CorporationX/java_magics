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
}

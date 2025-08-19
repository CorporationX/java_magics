package task34;

public class DangerousBook  extends MagicBook{
    private boolean hasPermission;
    public  DangerousBook(String name) {
        super(name);
    }

    public void setHasPermission(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    public void open() {
        if (hasPermission) {
            System.out.println("У вас есть разрешение читать опасную книгу!");
            System.out.println("Вы открыли книгу " + getTitle());
            setIsOpen(true);
        } else {
            System.out.println("Шшшш! Не трогайте меня! Вы не можете прочитать книгу " + getTitle());
        }



    }

}

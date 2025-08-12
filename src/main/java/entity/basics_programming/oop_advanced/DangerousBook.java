package entity.basics_programming.oop_advanced;

public class DangerousBook extends MagicBook {
    private boolean hasPermission = false; // имеется ли разрешение на взаимодействие с книгой

    public boolean isHasPermission() {
        return hasPermission;
    }

    public void setHasPermission(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    public DangerousBook(String title, boolean hasPermission) {
        super(title);
        this.hasPermission = hasPermission;
    }

    public DangerousBook(String title) {
        super(title);
    }

    @Override
    public void open() {
        if (hasPermission) {
            super.open();
        } else {
            System.out.println("\nШшшш! Не трогайте меня!\n"
                    + "Вы не можете прочитать книгу \"" + getTitle() + "\"");
        }
    }
}

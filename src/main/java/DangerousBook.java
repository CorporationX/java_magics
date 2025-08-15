public class DangerousBook extends MagicBook {
    private final boolean hasPermission;


    public DangerousBook(String title, boolean isOpen, boolean hasPermission) {
        super(title, isOpen);
        this.hasPermission = hasPermission;
    }

    @Override
    public void open() {
        if (!hasPermission) {
            System.out.println("Шшшш! Не трогайте меня! \nВы не можете прочитать книгу \"" + getTitle() + "\"");
            return;
        }
        super.open();
    }

    @Override
    public void read() {
        if (!hasPermission) {
            return; // Не читаем без разрешения
        }
        super.read();
    }
}

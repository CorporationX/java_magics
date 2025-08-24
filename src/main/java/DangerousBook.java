class DangerousBook extends MagicBook {
    private boolean hasPermission;

    public DangerousBook(String title, boolean hasPermission) {
        super(title);
        this.hasPermission = hasPermission;
    }

    @Override
    public void open() {
        if (!hasPermission) {
            System.out.println("Шшшш! Не трогайте меня! ");
            System.out.println("Вы не можете прочитать книгу " + '"' + getTitle() + '"');
        } else {
            super.open();
        }
    }
}
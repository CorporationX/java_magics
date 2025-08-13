public class WhisperingBook extends MagicBook {
    public WhisperingBook(String title, boolean isOpen) {
        super(title, isOpen);
    }

    @Override
    public void read() {
        if (isOpen()) {
            super.read();
            System.out.println("Книга шепчет: будь осторожен...");
        }
    }
}

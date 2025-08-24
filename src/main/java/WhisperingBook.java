class WhisperingBook extends MagicBook {
    public WhisperingBook(String title) {
        super(title);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Книга шепчет: будь осторожен...");
    }
}

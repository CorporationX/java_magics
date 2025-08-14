package entity.basics_programming.oop_advanced;

public class WhisperingBook extends MagicBook{
    public WhisperingBook(String title) {
        super(title);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Книга шепчет: будь осторожен...");
    }
}

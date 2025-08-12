package entity.basics_programming.oop_advanced;

public class Snape extends Professor {
    public Snape() {
        super("Северус Снегг", "Зельеварение");
    }

    @Override
    public void teach() {
        System.out.println("Сегодня я научу вас, как правильно варить зелья.");
    }
}

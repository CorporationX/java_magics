package entity.basics_programming.oop_advanced;

public class McGonagall extends Professor {
    public McGonagall() {
        super("Минерва МакГонагалл", "Трансфигурация");
    }

    @Override
    public void teach() {
        System.out.println("Фокус – и спичка превращается в иголку!");
    }
}

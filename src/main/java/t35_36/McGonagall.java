package t35_36;

public class McGonagall extends Professor{
    public McGonagall() {
        super("Минерва МакГонагалл", "Трансфигурация");
    }
    @Override
    public void teach() {
        System.out.println("Фокус – и спичка превращается в иголку!\n");
    }
}

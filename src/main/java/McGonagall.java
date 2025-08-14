public class McGonagall extends Professor {

    public McGonagall(String name, String subject) {
        super(name, subject);
    }

    @Override
    void teach() {
        System.out.println("Фокус – и спичка превращается в иголку!");
    }
}

public class Snape extends Professor {

    public Snape(String name, String subject) {
        super(name, subject);
    }

    @Override
    void teach() {
        System.out.println("Сегодня я научу вас, как правильно варить зелья");
    }
}

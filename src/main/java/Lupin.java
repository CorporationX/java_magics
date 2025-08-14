public class Lupin extends Professor {
    public Lupin(String name, String subject) {
        super(name, subject);
    }

    @Override
    void teach() {
        System.out.println("Сегодня мы будем учиться противостоять боггартам!");
    }
}

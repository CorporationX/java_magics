package entity.basics_programming.oop_advanced;

public class Lupin extends Professor {
    public Lupin() {
        super("Ремус Люпин", "Защита от Тёмных Искусств");
    }

    @Override
    public void teach() {
        System.out.println("Сегодня мы будем учиться противостоять боггартам!");
    }
}

class Lupin extends Professor {
    public Lupin() {
        super("Римус Люпин", "Защита от Тёмных Искусств");
    }
    @Override
    public void teach() {
        System.out.println("Сегодня мы будем учиться противостоять боггартам!");
    }
}

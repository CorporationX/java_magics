class Broomstick extends MagicTransport implements Flyable {
    public Broomstick (String name, int speed) {
        super(name, speed);
    }

    @Override
    public void fly() {
        System.out.println("Метла взлетает!");
    }

    @Override
    public void move() {
        fly();
        System.out.println("Метла летит со скоростью " + speed);
    }
}

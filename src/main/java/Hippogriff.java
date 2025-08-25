class Hippogriff extends MagicTransport implements Flyable {
    public Hippogriff(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void fly() {
        System.out.println("Гиппогриф машет крыльями!");
    }

    @Override
    public void move() {
        fly();
        System.out.println("Гиппогриф взлетает со скоростью " + speed);
    }
}

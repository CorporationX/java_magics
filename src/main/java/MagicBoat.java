class MagicBoat extends MagicTransport {
    public MagicBoat(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println("Лодка плывёт со скоростью " + speed);
    }
}

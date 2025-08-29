abstract class MagicTransport {
    protected String name;
    protected int speed;

    public MagicTransport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

     public abstract void move();

     public void printInfo() {
        System.out.println(String.format("Название: %s, скорость: %d", name, speed));
    }
}

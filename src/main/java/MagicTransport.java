public abstract class MagicTransport {
    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public MagicTransport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    abstract void move();

    void printInfo() {
        System.out.println("Название: " + name + ", cкорость: " + speed + " км/ч");
    }
}

package task37;

public abstract class MagicTransport {
    private String name;
    private int speed;

    public MagicTransport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void printInfo() {
        System.out.printf("Название: %s, скорость: %d" + "\n\n" , name, speed);
    }

    abstract public void move();

}

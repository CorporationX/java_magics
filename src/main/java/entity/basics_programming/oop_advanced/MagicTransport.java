package entity.basics_programming.oop_advanced;

abstract class MagicTransport {
    private String name; //название транспорта
    int speed; // скорость перемещения

    abstract void move(); // описывает перемещение транспорта

    public MagicTransport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Печатает имя и скорость транспорта
    void printInfo() {
        System.out.println("Название: " + name + ", скорость: " + speed);
    }
}

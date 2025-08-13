package entity.basics_programming.oop_advanced;

public class MagicalCreature {
    String name;

    public MagicalCreature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void interact() {
        System.out.println("Существо ведёт себя нейтрально.");
    }

    void interact(Muggle muggle) {
        System.out.println("Существо странно смотрит на магла.");
    }
}

package entity.basics_programming.oop_advanced.task40;

abstract class Wizard {
    String name;

    public Wizard(String name) {
        this.name = name;
    }

    abstract void castSpell(String spell);
}

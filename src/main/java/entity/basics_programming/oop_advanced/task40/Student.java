package entity.basics_programming.oop_advanced.task40;

public class Student extends Wizard {

    public Student(String name) {
        super(name);
    }

    @Override
    void castSpell(String spell) {
        System.out.println(name + " использует " + spell);
    }
}

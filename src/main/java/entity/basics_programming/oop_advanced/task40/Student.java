package entity.basics_programming.oop_advanced.task40;

public class Student extends Wizard {

    public Student(String name) {
        super(name);
    }

    @Override
    void castSpell(String spell) {
        if (isCheckingOfSpell(spell)) {
            System.out.println(name + " использует " + spell);
        } else {
            System.out.println("Это запрещённое заклинание! Дуэль прекращается!");
        }
    }

    public boolean isCheckingOfSpell(String spell) {
        return !spell.equals("Avada Kedavra");  // Упростила IDEA, возьму на заметку.
    }
}
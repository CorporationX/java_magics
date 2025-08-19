package task40;

public class Student extends Wizard {
    public Student(String name) {
        super(name);
    }

    @Override
    public void castSpell(String spell) {
        if (spell.equals(Wizard.AVADAKEDAVRA)) {
            System.out.println("Студент " + getName() + " хочет использовать " + spell + ". Но студенту это запрещено!");
        } else {
            System.out.println(getName() + " использует " + spell);
        }
    }
}

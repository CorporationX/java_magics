package OOP.AdvancedRemote;

import java.util.Objects;

public class Student extends Wizard {
    public Student(String name) {
        super(name);
    }

    @Override
    public void castSpell(String spell) {
        System.out.println(name + " использует " + spell);
        if (Objects.equals(spell, "Авада Кедавра")) {
            System.out.println("Студентам нельзя пользоваться запрещённым заклинанием!!!");
        }
    }
}

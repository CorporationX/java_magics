public class Student extends Wizard {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean castSpell(String spell) {
        if ("Avada Kedavra".equals(spell)) {
            System.out.println(name + " пытается произнести Авада Кедавра, но это запрещено для учеников!");
            return true;
        } else {
            System.out.println(name + " использует " + spell + "!");
            return true;
        }
    }
}

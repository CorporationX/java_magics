class Professor extends Wizard {
    public Professor(String name) {
        super(name);
    }

    @Override
    public boolean castSpell(String spell) {
        System.out.println(name + " применяет " + spell + ".");
        return true;
    }
}

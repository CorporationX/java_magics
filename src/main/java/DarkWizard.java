class DarkWizard extends Wizard {
    public DarkWizard(String name) {
        super(name);
    }

    @Override
    public boolean castSpell(String spell) {
        if ("Avada Kedavra".equals(spell)) {
            System.out.println(name + " произносит " + spell + "!");
            System.out.println("Это запрещённое заклинание! Дуэль прекращается!");
            // дуэль немедленно прерывается
            return false;
        } else {
            System.out.println(name + " произносит " + spell + "!");
            return true;
        }
    }
}
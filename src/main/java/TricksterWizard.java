class TricksterWizard extends DuelWizard {
    public TricksterWizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " использует ловушки и обмани!");
    }
}

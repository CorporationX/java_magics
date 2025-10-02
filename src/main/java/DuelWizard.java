class DuelWizard {
    private static String name;

    public DuelWizard(String name) {
        this.name = name;
    }


    public void attack() {
        System.out.println(name + " атакует простым заклинанием!");
    }

    static class OffensiveWizard extends DuelWizard {
        public OffensiveWizard(String name) {
            super(name);
        }

        @Override
        public void attack() {
            super.attack();
            System.out.println("Мощная атака боевым проклятием!");
        }
    }

    static class DefensiveWizard extends DuelWizard {
        public DefensiveWizard(String name) {
            super(name);
        }

        @Override
        public void attack() {
            super.attack();
            System.out.println(name + " cначала возводит защитный барьер, а затем контратакует!");
        }
    }

    static class TricksterWizard extends DuelWizard {
        public TricksterWizard(String name) {
            super(name);
        }

        @Override
        public void attack() {
            super.attack();
            System.out.println(name + "Использует ловушки и обманы!");
        }
    }


}
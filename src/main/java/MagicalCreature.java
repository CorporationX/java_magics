class MagicalCreature {
    public void interact() {
        System.out.println("Существо ведёт себя нейтрально.");
    }
    public void interact(Muggle muggle) {
        System.out.println("Существо ведёт себя подозрительно.");
    }

    class Hippogriff extends MagicalCreature {
        @Override
        void interact() {
            System.out.println("Существо ведёт себя нейтрально.");
        }

        @Override
        void interact(Muggle muggle) {
            System.out.println("Гиппогриф смотрит с подозрением.");
        }
    }
    class Troll extends MagicalCreature {
        @Override
        void interact() {
            System.out.println("Тролль медленно рычит.");
        }

        @Override
        void interact(Muggle muggle) {
            System.out.println("Тролль рявкает и пугает магла!");
        }
    }
    class Patronus extends MagicalCreature {
        @Override
        void interact() {
            System.out.println("Патронус освещает пространство и изгоняет дементоров!");
        }

        @Override
        void interact(Muggle muggle) {
            System.out.println("Патронус не реагирует, ведь маглы его не видят.");
        }
    }
    class Muggle{}

    }
public class MagicDuel {
    public static void main(String[] args) {
        DuelWizard[] wizards = {
                new OffensiveWizard("Гарри"),
                new DefensiveWizard("Рон"),
                new TricksterWizard("Фред"),
        };

        for (DuelWizard wizard : wizards) {
            wizard.attack();
            System.out.println();
        }
    }
}

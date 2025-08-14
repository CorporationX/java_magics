package t32_33;

public class MagicDuel {
    public static void main(String[] args) {
        DuelWizard[] wizards = {
                new OffensiveWizard("Гарри"),
                new DefensiveWizard("Рон"),
                new TricksterWizard("Фред"),
                new OffensiveWizard("Гермиона")

        };

        for (DuelWizard wizard : wizards) {
            wizard.attack();
        }

    }
}

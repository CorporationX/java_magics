package entity.basics_programming.oop_advanced;

public class MagicDuel {
    public static void main(String[] args) {
//        DuelWizard potter = new OffensiveWizard("Гарри");
//        DuelWizard ron = new DefensiveWizard("Рон");
//        DuelWizard fred = new TricksterWizard("Фред");
//
//        potter.attack();
//        ron.attack();
//        fred.attack();

        DuelWizard[] wizards = {
                new OffensiveWizard("Гарри"),
                new DefensiveWizard("Рон"),
                new TricksterWizard("Фред")
        };

        for (DuelWizard wizard : wizards) {
            wizard.attack();
            System.out.println();
        }
    }
}

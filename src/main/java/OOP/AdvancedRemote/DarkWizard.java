package OOP.AdvancedRemote;

import java.util.Objects;

public class DarkWizard extends Wizard {
    public DarkWizard() {
        super("Волан-де-Морт");
    }

    @Override
    public void castSpell(String spell) {
        System.out.println(name + " произносит " + spell);
        if (Objects.equals(spell, "Авада Кедавра")) {
            System.out.println("Убийственное заклинание..." + " Дуэль окончен.");
            return;
        }
        System.out.println(name + " зловеще произносит: " + spell + "!");
    }
}

package entity.basics_programming.oop_advanced.task40;

public class MagicDuelsPolymorphism {
    public static void main(String[] args) {
        Wizard[] duelists = {
                new Student("Гарри"),
                new Student("Гермиона"),
                new Student("Рон"),
                new Student("Фред"),
                new Student("Джордж"),

                new Professor("МакГоногал"),
                new Professor("Снегг"),
                new Professor("Дамблдор"),
                new Professor("Люпин"),
                new Professor("Слизнорт"),

                new DarkWizard("Лестрейндж"),
                new DarkWizard("Драко"),
                new DarkWizard("Люциус"),
                new DarkWizard("Волдеморт"),
                new DarkWizard("Гойл")
        };

        String[] spell = {
                "Expelliarmus",
                "Lumos",
                "Avada Kedavra"
        };

        MagicDuels.duels(duelists, spell);
    }
}

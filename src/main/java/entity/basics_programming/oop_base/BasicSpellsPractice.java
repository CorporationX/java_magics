package entity.basics_programming.oop_base;

public class BasicSpellsPractice {
    public static void main(String[] args) {
        castLumos();

        int wandLength = getWandLength();
        System.out.println("Длина палочки: " + wandLength + " дюймов");

        String chant1 = getHouseChant("Гриффиндор");
        System.out.println("Девиз факультета \"Гриффиндор\": " + chant1);
        String chant2 = getHouseChant("Пуффендуй");
        System.out.println("Девиз факультета \"Пуффендуй\": " + chant2);
        String chant3 = getHouseChant("Слизерин");
        System.out.println("Девиз факультета \"Слизерин\": " + chant3);
        String chant4 = getHouseChant("Когтевран");
        System.out.println("Девиз факультета \"Когтевран\": " + chant4);
    }

    static void castLumos() {
        System.out.println("✨ \"Люмос!\" (Загорается свет)");
    }

    static int getWandLength() {
        return 11;
    }

    static String getHouseChant(String hauseName) {
        String slogan;
        switch (hauseName) {
            case "Гриффиндор":
                slogan = "Смелость, отвага и рыцарство!";
                break;
            case "Пуффендуй":
                slogan = "Трудолюбие, верность и дружба!";
                break;
            case "Когтевран":
                slogan = "Мудрость, знания и интеллект!";
                break;
            case "Слизерин":
                slogan = "Амбиции и хитрость";
                break;
            default:
                slogan = "Ошибка в названии. Такого факультета нет";
        }
        return slogan;
    }
}

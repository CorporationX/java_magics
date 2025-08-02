import org.w3c.dom.ls.LSOutput;

public class BasicSpellsPractice {
    public static void main(String[] args) {
        castLumos();

        int wandLength = getWandLength();
        System.out.println("Длина палочки: " + wandLength + " дюймов");

        String chant = getHouseChant("Гриффиндор");
        System.out.println("Девиз факультета: " + chant);
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

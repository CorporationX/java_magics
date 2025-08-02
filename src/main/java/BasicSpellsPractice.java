import java.util.Objects;

public class BasicSpellsPractice {
    public static void main(String[] args) {
        castLumos();
        int length = getWandLength();
        System.out.println("Длина палочки: " + getWandLength() + " дюймов.");
        System.out.println("Девиз факультета: " + getHouseChant("Гриффиндор"));
    }

    public static void castLumos(){
        System.out.println("\"Люмос!\" (Загорается свет)");
    }

    public static int getWandLength(){
        return 11;
    }

    public static String getHouseChant(String houseName) {
        if (Objects.equals(houseName, "Гриффиндор")) {
            return "Смелость, отвага и рыцарство!";
        } else if (Objects.equals(houseName, "Слизерин")) {
            return "Хитрость, амбиции и величие!";
        } else if (Objects.equals(houseName, "Пуффендуй")) {
            return "Трудолюбие, верность и честность!";
        } else if (Objects.equals(houseName, "Когтевран")) {
            return "Мудрость, честь и творчество";
        }
        return houseName;
    }
}

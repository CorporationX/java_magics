public class BasicSpellsPractice {
    static void castLumos() {
        System.out.println("\"Люмос!\" (Загорелся свет)");
    }

    static int getWandLength() {
        return 11;
    }

    static String getHouseChant(String houseName) {
        if (houseName == "Гриффиндор") {
            return "Смелость, отвага, рыцарство!";
        } else if (houseName == "Пуффендуй") {
            return "Девиз Пуффендуй!";
        } else if (houseName == "Слизерин") {
            return  "Девиз Слизерин!";
        } else {
            return "Девиз факультета!!!";
        }
    }

    public static void main(String[] args) {
        castLumos();

        int length = getWandLength();
        System.out.println("Длина палочки: " + length);

        String house = "Гриффиндор";
        String chant = getHouseChant(house);
        System.out.println("Девиз факультета " + house + ": " + chant);

    }


}


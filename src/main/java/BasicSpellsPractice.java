public class BasicSpellsPractice {
    // 1. Метод void, который ничего не возвращает.
    static void castLumos() {
        System.out.println("Люмос!");
    }

    // 2. Метод int, который возвращает целое число.
    static int getWandLength() {
        return 11;
    }

    // 3. Метод, который принимает название и возвращет строку.
    static String getHouseChant(String houseName) {
        if (houseName.equals("Гриффиндор")) {
            return "Смелость, отвага, рыцарство!";
        } else if (houseName.equals("Слизерин")) {
            return "Хитрость, решительность, амбициозность!";
        } else if (houseName.equals("Когтевран")) {
            return "Ум, мудрость, остроумие!";
        } else if (houseName.equals("Пуффендуй")) {
            return "Трудолюбие, верность, честность!";
        } else {
            return "Данного факультета не существует";
        }
    }

        // 4. Метод, выводящий main, который выводит все три метода.
        public static void main (String[]args){
            // Вызываем метод без возвращаемого значения
            castLumos();

            // Вызываем метод, возвращающий int, и сохраняем результат
            int length = getWandLength();
            System.out.println("Длина палочки: " + length + " дюймов.");

            // Вызываем метод, возвращающий String, и сохраняем результат
            String chant = getHouseChant("Гриффиндор");
            System.out.println("Девиз факультета: " + chant);
        }
    }

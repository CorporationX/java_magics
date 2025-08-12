

import java.util.Scanner;


public class metodi_task_19 {
    static void castLumos(){
        System.out.println("Люмос!");
    }
    static int getWandLength(){
        int lenght = 11;
        return lenght;
    }
    public static String getHouseChant(String houseName){
        return switch (houseName.toLowerCase()) {
            case "гриффиндор" -> "Смелость, отвага и честь!";
            case "павлов" -> "Ум, мудрость и знание!";
            case "слизерн" -> "Амбиции, хитрость и сила!";
            case "равенкло" -> "Интеллект, творчество и мудрость!";
            default -> " Такого факультета не существует.";
        };
    }
    
    public static void main(String[] args){
        
           
            try (Scanner scanner = new Scanner(System.in)) {
                castLumos();
                
                int lenght = getWandLength();
                System.out.println("Длина палочки: " + lenght + " Дюймов");
                
                System.out.println("Введи факультет:");
                String haoseName = scanner.nextLine();
                String chant = getHouseChant(haoseName);
                System.out.println("Девиз факультета: " + haoseName + chant);
            }
            
    }
}


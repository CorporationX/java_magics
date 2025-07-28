public class Quidditch {
    public static void main(String[] args){
        for (int i = 1;i <= 3;i++){
            System.out.print("Запущен мяч под названием: ");

            if (i == 1){
                System.out.println("Quaffle");
            } else if (i == 2){
                System.out.println("Bludger");
            } else {
                System.out.println("Golden Snitch");
            }
        }
    }
}

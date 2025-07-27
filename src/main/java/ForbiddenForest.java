public class ForbiddenForest {
    public static void main(String[] args){
        boolean wand = false;
        boolean zel = true;
        boolean art = false;
        int magic = 90;

        if(wand && magic>80){
            System.out.println("Можете пройти");
        } else if ((magic>=50 && magic<=80) && zel) {
            System.out.println("Можете пройти");
        } else if(magic<50 && art) {
            System.out.println("Можете пройти");
        } else {
            System.out.println("Вы не пройдёте!");
        }
        if(magic>95 && wand){
            System.out.println("Вы не только прошли, но смогли взять друга!");
        }
    }
}

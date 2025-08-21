import java.util.Random;

public class checking_wizard7 {
    public static void main(String[] args ) {
        Random random =  new Random();
        int magicPower = random.nextInt(40,100);
        boolean magicStick = random.nextBoolean();
        boolean potionInvisible = random.nextBoolean();
        boolean artifact = random.nextBoolean();

        if (magicPower >95) {
            System.out.println("Вы можете пройти сквозь защитные чары, и взять с собой друга!!!");
        } else if (magicPower >80) {
            System.out.println("Вы можете пройти сквозь защитные чары!");
        } else if (magicPower >=50 && potionInvisible) {
            System.out.println("Вы можете пройти сквозь защитные чары!");
        } else if (magicPower <50 && artifact) {
            System.out.println("Вы не можете пройти защитные чары(");
        }
        System.out.println("Магическая сила: " + magicPower);
        System.out.println("Есть магическая палочка? " + magicStick);
        System.out.println("Есть зелье невидимости? " +  potionInvisible);
        System.out.println("Есть артифакт Хагрида? " + artifact);
    }
}

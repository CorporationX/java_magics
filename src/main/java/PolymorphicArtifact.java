import java.util.Random;

public class PolymorphicArtifact {
    public static void main(String[] args) {
       Wizard[] wizards = {
               new Dumbledore(),
               new Snape2(),
               new Peeves(),
       };
       Random random = new Random();

        Wizard chosenOne = wizards[random.nextInt(wizards.length)];
        System.out.println("Перед нами маг! Кто это?");

        if (chosenOne instanceof Dumbledore) {
            System.out.println("Это точно Дамблдор.");
        } else if (chosenOne instanceof Snape2) {
            System.out.println("Снегг смотрит, нахмуривая брови.");
        } else if (chosenOne instanceof Peeves) {
            System.out.println("Это Пивз!!!");
        }
        chosenOne.castSpell();
    }
}

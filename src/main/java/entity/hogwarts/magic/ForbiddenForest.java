package entity.hogwarts.magic;

import java.util.Random;

public class ForbiddenForest {
    public static void main(String[] args) {

        // ✨ Объявляем переменные (магическая сила, палочка, зелье, артефакт)
//        int magicalPower = 75;       // магическая сила        |
//        boolean hasWand = true;      // есть ли палочка?       | Данные из задачи
//        boolean hasPotion = true;    // есть ли зелье?         |
//        boolean hasArtifact = true;  // есть ли артефакт?      |

        int magicalPower = new Random().nextInt(111); // магическая сила
        boolean hasWand = new Random().nextBoolean();        // есть ли палочка?
        boolean hasPotion = new Random().nextBoolean();      // есть ли зелье?
        boolean hasArtifact = new Random().nextBoolean();    // есть ли артефакт?

        System.out.println("магическая сила " + magicalPower + "\nесть ли палочка? " +  hasWand +
                "\nесть ли зелье? " + hasPotion + "\nесть ли артефакт? " + hasArtifact);

        // ✨ Используем if-else, чтобы проверить, может ли волшебник пройти и Выводим результат в консоль
        //    Добавил условие: если магическая сила больше 95, то можем взять друга.
        if (hasWand && magicalPower > 80) {
            System.out.println("Вы можете пройти сквозь защитные чары");
            if (magicalPower > 95)
                System.out.println("Вы не только прошли, но и взяли с собой друга!");
        } else if (magicalPower >= 50 && hasPotion) {
            System.out.println("У вас средняя магическая сила, но вы использовали зелье невидимости чтобы пройти чары");
        } else if (magicalPower < 50 && hasArtifact) {
            System.out.println("Даже со слабой магической силой вы смогли пройти, использовав артефакт Хагрида!");
        } else
            System.out.println("Увы, чары вам не пройти..");

    }
}

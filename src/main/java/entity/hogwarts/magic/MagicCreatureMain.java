package entity.hogwarts.magic;

public class MagicCreatureMain {
    public static void main(String[] args) {
        MagicCreature pushistik = new MagicCreature();
        pushistik.setName("Пушистик");
        pushistik.setHealth(60);
        pushistik.setMood(70);

        pushistik.printStatus();

        pushistik.feed(5);
        pushistik.play();
        pushistik.scare(); //ввел, чтобы уменьшать настроение (в условиях задачи не нашел пункта, который уменьшает настроение)
        pushistik.play();

        //проверка на переедание
//        for (int i = 0; i < 10; i++) pushistik.feed(50);
        //проверка на выживание через игру
//        for (int i = 0; i < 30; i++) pushistik.play();
        // проверка на агрессивность
//        for (int i = 0; i < 10; i++) pushistik.scare();

        pushistik.printStatus();
    }
}

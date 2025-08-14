package entity.basics_programming.oop_advanced;

public class MagicBookMain {
    public static void main(String[] args) {
        MagicBook magicHistory = new MagicBook("История магии");
        MagicBook bookOfSpells = new WhisperingBook("Книга заклинаний");
        DangerousBook monsterBooksAboutMonsters = new DangerousBook("Монстр книги о монстрах");
        DangerousBook monsterBooksAboutMonsters2 = new DangerousBook("Монстр книги о монстрах2", false);

        magicHistory.close();

        monsterBooksAboutMonsters.setHasPermission(true);

        magicHistory.open();
        magicHistory.close();

        bookOfSpells.open();
        bookOfSpells.close();

        monsterBooksAboutMonsters.open();
        monsterBooksAboutMonsters.close();

        // тесты
        monsterBooksAboutMonsters2.open();
        monsterBooksAboutMonsters2.close();
        monsterBooksAboutMonsters2.setHasPermission(true);
        monsterBooksAboutMonsters2.open();
        monsterBooksAboutMonsters2.close();
    }
}

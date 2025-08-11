package entity.basics_programming.oop_advanced;

public class MagicBookMain {
    public static void main(String[] args) {
        MagicBook magicHistory = new MagicBook("История магии");
        MagicBook bookOfSpells = new WhisperingBook("Книга заклинаний");
        DangerousBook monsterBooksAboutMonsters = new DangerousBook("Монстр книги о монстрах");
        MagicBook monsterBooksAboutMonsters2 = new DangerousBook("Монстр книги о монстрах2", false);

        magicHistory.close();

        monsterBooksAboutMonsters.setHasPermission(true);

        magicHistory.open();
        magicHistory.close();

        bookOfSpells.open();
        bookOfSpells.close();

        monsterBooksAboutMonsters.open();
        monsterBooksAboutMonsters2.close();
        // почему в классе родителе при вызове метода close() теряется значение переменной isOpen?
        // в дебаге только понял, что она до вызова метода close() есть, а при его вызове как-будто
        // снова становится по умелчанию в false. Как к ней можно обратиться и зафиксировать ее?

        monsterBooksAboutMonsters2.open();
        monsterBooksAboutMonsters2.close();
    }
}

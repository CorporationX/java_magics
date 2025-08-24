package entity.onboarding;

import static entity.onboarding.Book.*;

public class BookMain {
    static void main() {
        // Реализуйте методы для следующих действий:
        // добавление новой книги и её местонахождения в библиотеке;
        addBook(new Book("Title1", "Author1", 1888), "полка1");
        addBook(new Book("Title2", "Author2", 1900), "полка2");
        addBook(new Book("Title4", "Author4", 1990), "полка4");
        addBook(new Book("Title3", "Author3", 1996), "полка4");
        addBook(new Book("Title5", "Author5", 1907), "полка5");

        printAllBooks();

        // удаление книги по её названию, автору и году издания;
        removeBook("Title4", "Author4", 1990);

        // поиск книги и вывода информации о её местонахождении в библиотеке,
        // используя название книги, автора и год издания;
        findBook("Title5", "Author5", 1907);

        // вывод списка всех книг и их местонахождения в библиотеке.
        Book.printAllBooks();
    }
}
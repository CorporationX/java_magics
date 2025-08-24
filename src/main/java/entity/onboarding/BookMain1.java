package entity.onboarding;

import java.util.HashMap;
import java.util.Map;

public class BookMain1 {
    static void main() {
        Map<Book1, String> books = new HashMap<>();
        books.put(new Book1("Title1", "Author1", 1888), "Location1");
        books.put(new Book1("Title2", "Author2", 1900), "Location2");
        books.put(new Book1("Title4", "Author4", 1990), "Location4");
        books.put(new Book1("Title3", "Author3", 1996), "Location3");
        books.put(new Book1("Title5", "Author5", 1999), "Location5");
        books.put(new Book1("Title6", "Author6", 2000), "Location6");
        books.put(new Book1("Title7", "Author7", 1999), "Location7");

        // удаление книги по её названию, автору и году издания;
        books.remove(new Book1("Title4", "Author4", 1990));

        // поиск книги и вывода информации о её местонахождении в библиотеке,
        // используя название книги, автора и год издания;
        System.out.println(books.get(new Book1("Title3", "Author3", 1996)));

        // вывод списка всех книг и их местонахождения в библиотеке.
        for (Map.Entry<Book1, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

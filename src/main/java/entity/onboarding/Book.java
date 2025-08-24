package entity.onboarding;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book {
    private String title; // название книги
    private String author; // автор книги
    private int year; // год издания
    private static Map<Book, String> books = new HashMap<>();


    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return "Книга(\"" + title + "\", " + author + ", " + year + ") лежит на ";
    }

    public static void printAllBooks() {
        for (Map.Entry<Book, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    public static void addBook(Book book, String location) {
        books.put(book, location);
    }

    public static void removeBook(String title, String author, int year) {
        books.remove(new Book(title, author, year));
    }

    public static void findBook(String title, String author, int year) {
        System.out.println(books.get(new Book(title, author, year)));
    }
}

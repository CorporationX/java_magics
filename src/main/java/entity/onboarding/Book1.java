package entity.onboarding;

import java.util.Objects;

public class Book1 {
    private String title;
    private String author;
    private int year;

    public Book1(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book1 book1 = (Book1) o;
        return year == book1.year && Objects.equals(title, book1.title) && Objects.equals(author, book1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return "Book1{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

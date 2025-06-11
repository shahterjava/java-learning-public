package oop.book;

public class Book {
    private String title;
    private String author;
    private int pages;
    private static int totalBooks;

    public Book() {
        this.title = "Untitled";
        this.author = "Unknow";
        this.pages = 0;
        totalBooks ++;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
        totalBooks ++;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        totalBooks ++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}

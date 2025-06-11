package oop.interfaces.printing;

public class Book extends PrintableItem implements Printable {
    private String author;
    private int pages;

    public Book(String name, String author, int pages) {
        super(name);
        this.author = author;
        this.pages = pages;
    }

    public void print(){
        System.out.println("Book: " + getName() + " by "+ author + ", " + pages + " pages." );
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

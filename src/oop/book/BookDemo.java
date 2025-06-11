package oop.book;

public class BookDemo {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Капитанская дочка", "Пушкин А.С.");
        Book book3 = new Book("Герой нашего времени", "Лермонтов М.Ю.", 512);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(Book.getTotalBooks());
    }
}

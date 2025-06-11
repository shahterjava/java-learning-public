package oop.interfaces.printing;

import java.util.ArrayList;
import java.util.List;

public class PrintingDemo {

    public static void main(String[] args) {
        List<Printable> items = new ArrayList<>();
        items.add(new Document("Passport", "Russian Federation"));
        items.add(new ImageFile("Image", 250,250));
        items.add(new Book("Отцы и дети", "Иван Тургенев", 412));
        PrintService print = new PrintService();
        print.batchPrint(items);

    }
}

package oop.interfaces.printing;

import java.util.List;

public class PrintService {
    public void batchPrint(List<Printable> items){
        for (Printable item : items) {
            item.print();
        }
    }
}

package oop.interfaces.printing;

public abstract class PrintableItem implements Printable {
    private String name;

    public PrintableItem(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Printable item: "+ name);
    }

    public String getName() {
        return name;
    }


}

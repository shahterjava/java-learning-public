package oop.inheritance.animals;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Some generic animal sound");
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal: <" +name+ ">";
    }
}

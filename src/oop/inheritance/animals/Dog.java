package oop.inheritance.animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog: <" + name +">";
    }
}

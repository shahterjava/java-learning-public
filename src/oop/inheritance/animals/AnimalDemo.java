package oop.inheritance.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Snake"));
        animalList.add(new Dog("Bobik"));
        animalList.add(new Cat("Sake"));
        animalList.add(new Cat("Ryzhyk"));
        animalList.add(new Dog("Sharik"));
        for (Animal animal : animalList) {
            animal.makeSound();
            System.out.println(animal.toString());
        }
    }
}

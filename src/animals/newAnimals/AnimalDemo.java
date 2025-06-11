package animals.newAnimals;

import java.util.List;

public class AnimalDemo {

    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Dog("Buddy"),
                new Cat("Whiskers")
        );
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
        }
    }
}

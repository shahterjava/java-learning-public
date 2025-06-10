package animals;

public class ZooDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Рекс"),
                new Cat("Мурка"),
                new Dog("Бобик")
        };
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}

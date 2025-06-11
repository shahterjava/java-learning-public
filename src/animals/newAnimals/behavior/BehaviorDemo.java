package animals.newAnimals.behavior;

public class BehaviorDemo {

    public static void main(String[] args) {
        Walkable[] walkers = {
                new Dog(),
                new Duck(),
        };
        Swimmable[] swimmers = {
                new Fish(),
                new Duck(),
        };
        for (Walkable walker : walkers) {
            walker.walk();
        }
        for (Swimmable swimmer : swimmers) {
            swimmer.swim();
        }
    }
}

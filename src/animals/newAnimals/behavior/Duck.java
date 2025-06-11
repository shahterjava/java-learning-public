package animals.newAnimals.behavior;

public class Duck implements Walkable,Swimmable{
    @Override
    public void walk() {
        System.out.println("Duck is walking waddle-waddle.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming smoothly");
    }
}

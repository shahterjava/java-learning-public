package Animals;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Животное издает звук.");
    }
    public String getName() {
        return name;
    }
}

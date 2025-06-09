package shape;

import java.util.Map;

public class Circle extends Shape implements Drawable{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public void draw(){
        System.out.println(getName()+" (круг): радиус = "+ radius);
    }
}

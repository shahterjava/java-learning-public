package shape;

public class Rectangle extends Shape implements Drawable{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width*height;
    }
    @Override
    public void draw(){
        System.out.println(getName()+ " (прямоугольник): ширина = "+ width + ", высота = " + height);
    }
}

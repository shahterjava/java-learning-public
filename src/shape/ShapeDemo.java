package shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Круг 1", 3),
                new Rectangle("Прямоугольник 1", 4,5 ),
                new Circle("Круг 2", 2.5)
        };
        for (Shape shape : shapes) {
            System.out.println(shape.getName()+": площадь = "+ shape.getArea());
            ((Drawable)shape).draw();
            System.out.println();
        }
    }
}

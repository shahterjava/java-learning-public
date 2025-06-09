package graphics;

public class CircleElement extends GraphicElement implements Movable{
    private int x,y;
    private int radius;

    public CircleElement(String id, int x, int y, int radius) {
        super(id);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    @Override
    public void render(){
        System.out.println("Круг "+getId()+": координаты (" + x + ", " + y + "), радиус "+ radius );
    }
}

package graphics;

public class GraphicsDemo {
    public static void main(String[] args) {
        GraphicElement[] elements = {
                new CircleElement("C1",10,10,5),
                new TextElement("T1", "Privet, Java!"),
                new CircleElement("C2", 5,5,2)
        };
        for (GraphicElement element : elements) {
            element.render();
            if(element instanceof Movable){
                ((Movable)element).move(1,1);
                System.out.println("-> после перемещения: ");
                element.render();
            }
            System.out.println();

        }
    }
}

package graphics;

public abstract class GraphicElement {
    private String id;


    public GraphicElement(String id) {
        this.id = id;
    }

    public abstract void render();

    public String getId() {
        return id;
    }
}

package graphics;

public class TextElement extends GraphicElement {
    private String text;

    public TextElement(String id, String text) {
        super(id);
        this.text = text;
    }
    @Override
    public void render(){
        System.out.println("Текст: " + getId() + ":\"" + text + "\"");
    }
}

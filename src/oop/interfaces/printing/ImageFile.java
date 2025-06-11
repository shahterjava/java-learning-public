package oop.interfaces.printing;

public class ImageFile implements Printable{
    private String fileName;
    private int width;
    private int height;

    public ImageFile(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    @Override
    public void print(){
        System.out.println("Printing image <"+fileName+"> of size <"+width+">x<"+height+">");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

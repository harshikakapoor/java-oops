package classBasics;

public class Rectangle2 implements ShapeInterface{
    private String color;
    private int length;
    private int width;

    public Rectangle2(String color, int length, int width){
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return length*width;
    }
}

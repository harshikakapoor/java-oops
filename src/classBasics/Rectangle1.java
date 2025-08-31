package classBasics;

public class Rectangle1 extends Shape{
    private int length;
    private int width;
    public Rectangle1(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
}

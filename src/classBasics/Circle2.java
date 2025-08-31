package classBasics;
// to implement the interface
public class Circle2 implements ShapeInterface{
    private String color;
    private int radius;
    // constructor for circle2 class
    public Circle2(String color, int radius){
        this.color = color;
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }

    public double getArea(){
        double pi = Math.PI;
        return pi*radius*radius;
    }
}

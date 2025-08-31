package classBasics;
// circle inherits from shape
public class Circle1 extends Shape {
    private int radius;
    // also add color because we need to pass it to the parent(shape)
    public Circle1(String color, int radius){
        // getting the color from parent class instead
        // initialise inherited property
        super(color);
        this.radius = radius;
    }

    // method overriding the shape class method
    public double getArea(){
        double pi = Math.PI;
        return pi*radius*radius;
    }
}

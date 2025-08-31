package classBasics;
// The parent class shape
public abstract class Shape {
    private String colour;

    // Constructor to initialize the colour
    public Shape(String colour) {
        this.colour = colour;
    }
    // Getter method to retrieve the colour
    public String getColour(){
        return colour;
    }
    // This is an abstract method.
    // It has no body because the implementation is different for each shape.
    // Every subclass of Shape MUST provide its own implementation for this method.
    public abstract double getArea();

    public static void main(String[] args){
        // declaring both of them as shape object so that they have common properties and behaviours of a shape
        // treat them normally in our code
        Shape myCircle = new Circle1("Red",7);
        Shape myRectangle = new Rectangle1("Blue",6,8);

        // runtime polymorphism : shape obj calling different getArea method aka overriding
        double circleArea = myCircle.getArea();
        double rectangleArea = myRectangle.getArea();
        System.out.println("Circle area : "+circleArea);
        System.out.println("Rectangle area : "+rectangleArea);
    }
}

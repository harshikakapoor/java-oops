package classBasics;
// this interface is just like a contract
// all the classes which implements this interface must have these methods in them
public interface ShapeInterface {
    // methods are implicitly abstract and public in an interface
    String getColor();
    double getArea();
}

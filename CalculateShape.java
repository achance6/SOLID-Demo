/* Every shape has an area. No other methods such as volume() are defined
as that would break Interface Segregation Principle, not every shape is 3D.
This is the base class for every shape
 */
public interface CalculateShape extends Shape {

    double area();
    // Violation of Interface Segregation! Extraneous for 2D shapes
    // double volume()

}

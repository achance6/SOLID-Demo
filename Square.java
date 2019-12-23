/*
Instead of combining all shapes into a single Shape class with multiple functions,
we follow the single responsibility principle of SOLID. We also follow the Liskov Sub Principle
by allowing a square to be completely substitutable for a rectangle.
 */
public class Square extends Rectangle {
    Square(double length) {
        super(length, length);
    }
}

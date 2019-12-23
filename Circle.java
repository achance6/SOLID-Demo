public class Circle implements CalculateShape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

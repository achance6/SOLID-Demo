public class Cube implements Calculate3DShape, CalculateShape {
    private double length;

    Cube(double length) {
        this.length = length;
    }

    @Override
    public double volume() {
        return area() * length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}

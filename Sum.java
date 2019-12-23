public class Sum {
    Sum() {}

    // Instead of having this function be dependent on what kind of shape it is, we
    // follow dependency inversion principle so that if we remove square class for example
    // we dont have to do anything to this function.
    public double sumTwoDAreas(CalculateShape[] twoDShapes) {
        double sum = 0;
        for (CalculateShape twoDShape : twoDShapes) {
            sum += twoDShape.area();
        }
        return sum;
    }
}

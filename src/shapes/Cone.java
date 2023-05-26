package shapes;

public class Cone extends RoundShapes{
    public Cone(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    public String toString() {
        return "Cone" + getHeight() + " " + getRadius();
    }
}

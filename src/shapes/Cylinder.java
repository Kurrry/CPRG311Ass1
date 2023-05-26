package shapes;

public class Cylinder extends RoundShapes{
    public Cylinder(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    public String toString() {
        return "Cylinder" + getHeight() + " " + getRadius();
    }
}

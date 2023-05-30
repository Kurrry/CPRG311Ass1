package shapes;

public class Cylinder extends RoundShapes{
    public Cylinder(double height, double radius) {
        this.setHeight(height);
        this.setRadius(radius);
    }

    public String toString() {
        return "Cylinder";
    }
}

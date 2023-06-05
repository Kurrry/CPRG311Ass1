package shapes;

/**
 * Represents a cylinder.
 * @author Group 9
 */
public class Cylinder extends RoundShapes{
    /**
     * Constructor assigns values for height and radius of a cylinder.
     *
     * @param height Height holds the cylinder's height.
     * @param radius Radius holds the cylinder's radius.
     */
    public Cylinder(double height, double radius) {
        this.setHeight(height);
        this.setRadius(radius);
    }

    public String toString() {
        return "Cylinder";
    }
}

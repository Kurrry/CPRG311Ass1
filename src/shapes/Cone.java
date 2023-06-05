package shapes;

/**
 * Represents a cone.
 * @author Group 9
 */
public class Cone extends RoundShapes{
    /**
     * Constructor assigns values for height and radius of a cone.
     *
     * @param height Height holds the Cone's height.
     * @param radius Side holds the Cone's radius.
     */
    public Cone(double height, double radius) {
        this.setHeight(height);
        this.setRadius(radius);
    }

    /**
     * Calculates the volume.
     *
     * @return Cone volume.
     */
    @Override
    public double calcVolume() {
        return ((double) 1 / 3) * super.calcVolume();
    }

    public String toString() {
        return "Cone";
    }
}

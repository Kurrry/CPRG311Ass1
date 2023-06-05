package shapes;

/**
 * Represents a square prism.
 * @author Group 9
 */
public class SquarePrism extends Prism{
    /**
     * Constructor assigns values for height and edge length of a square prism.
     *
     * @param height Height holds the square prism's height.
     * @param side Side holds the square prism's edge length.
     */
    public SquarePrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    /**
     * Calculates the volume.
     *
     * @return Square prism volume.
     */
    @Override
    public double calcVolume() {
        return super.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "SquarePrism";
    }
}

package shapes;

/**
 * Represents a triangular prism.
 * @author Group 9
 */
public class TriangularPrism extends Prism{
    /**
     * Constructor assigns values for height and edge length of a triangular prism.
     *
     * @param height Height holds the triangular prism's height.
     * @param side Side holds the triangular prism's edge length.
     */
    public TriangularPrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    /**
     * Calculates the base area.
     *
     * @return Triangular prism base area.
     */
    @Override
    public double calcBaseArea() {
        return (super.calcBaseArea() * Math.sqrt(3)) / 4;
    }

    /**
     * Calculates the volume.
     *
     * @return Triangular prism volume.
     */
    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "TriangularPrism";
    }
}
